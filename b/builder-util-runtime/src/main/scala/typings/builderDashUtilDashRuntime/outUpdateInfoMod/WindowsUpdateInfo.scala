package typings.builderDashUtilDashRuntime.outUpdateInfoMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUpdateInfo extends UpdateInfo {
  var packages: js.UndefOr[StringDictionary[PackageFileInfo] | Null] = js.undefined
  /**
    * @deprecated
    * @private
    */
  var sha2: js.UndefOr[String] = js.undefined
}

object WindowsUpdateInfo {
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: String,
    releaseDate: String,
    sha512: String,
    version: String,
    packages: StringDictionary[PackageFileInfo] = null,
    releaseName: String = null,
    releaseNotes: String | js.Array[ReleaseNoteInfo] = null,
    sha2: String = null,
    stagingPercentage: Int | Double = null
  ): WindowsUpdateInfo = {
    val __obj = js.Dynamic.literal(files = files, path = path, releaseDate = releaseDate, sha512 = sha512, version = version)
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (releaseName != null) __obj.updateDynamic("releaseName")(releaseName)
    if (releaseNotes != null) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (sha2 != null) __obj.updateDynamic("sha2")(sha2)
    if (stagingPercentage != null) __obj.updateDynamic("stagingPercentage")(stagingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateInfo]
  }
}

