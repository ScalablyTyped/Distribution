package typings.builderUtilRuntime.updateInfoMod

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
    packages: js.UndefOr[Null | StringDictionary[PackageFileInfo]] = js.undefined,
    releaseName: js.UndefOr[Null | String] = js.undefined,
    releaseNotes: js.UndefOr[Null | String | js.Array[ReleaseNoteInfo]] = js.undefined,
    sha2: String = null,
    stagingPercentage: js.UndefOr[Double] = js.undefined
  ): WindowsUpdateInfo = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(packages)) __obj.updateDynamic("packages")(packages.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseName)) __obj.updateDynamic("releaseName")(releaseName.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseNotes)) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (sha2 != null) __obj.updateDynamic("sha2")(sha2.asInstanceOf[js.Any])
    if (!js.isUndefined(stagingPercentage)) __obj.updateDynamic("stagingPercentage")(stagingPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateInfo]
  }
}

