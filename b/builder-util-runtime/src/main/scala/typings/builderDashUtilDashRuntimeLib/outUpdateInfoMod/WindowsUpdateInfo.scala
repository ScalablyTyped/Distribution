package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUpdateInfo extends UpdateInfo {
  var packages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[PackageFileInfo] | scala.Null] = js.undefined
  /**
    * @deprecated
    * @private
    */
  var sha2: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsUpdateInfo {
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: java.lang.String,
    releaseDate: java.lang.String,
    sha512: java.lang.String,
    version: java.lang.String,
    packages: org.scalablytyped.runtime.StringDictionary[PackageFileInfo] = null,
    releaseName: java.lang.String = null,
    releaseNotes: java.lang.String | js.Array[ReleaseNoteInfo] = null,
    sha2: java.lang.String = null,
    stagingPercentage: scala.Int | scala.Double = null
  ): WindowsUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("releaseDate")(releaseDate)
    __obj.updateDynamic("sha512")(sha512)
    __obj.updateDynamic("version")(version)
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (releaseName != null) __obj.updateDynamic("releaseName")(releaseName)
    if (releaseNotes != null) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (sha2 != null) __obj.updateDynamic("sha2")(sha2)
    if (stagingPercentage != null) __obj.updateDynamic("stagingPercentage")(stagingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateInfo]
  }
}

