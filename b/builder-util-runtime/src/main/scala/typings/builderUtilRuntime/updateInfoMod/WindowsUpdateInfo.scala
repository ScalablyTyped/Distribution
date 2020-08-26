package typings.builderUtilRuntime.updateInfoMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsUpdateInfo extends UpdateInfo {
  var packages: js.UndefOr[StringDictionary[PackageFileInfo] | Null] = js.native
  /**
    * @deprecated
    * @private
    */
  var sha2: js.UndefOr[String] = js.native
}

object WindowsUpdateInfo {
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: String,
    releaseDate: String,
    sha512: String,
    version: String
  ): WindowsUpdateInfo = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateInfo]
  }
  @scala.inline
  implicit class WindowsUpdateInfoOps[Self <: WindowsUpdateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPackages(value: StringDictionary[PackageFileInfo]): Self = this.set("packages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
    @scala.inline
    def setPackagesNull: Self = this.set("packages", null)
    @scala.inline
    def setSha2(value: String): Self = this.set("sha2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha2: Self = this.set("sha2", js.undefined)
  }
  
}

