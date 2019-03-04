package typings
package builderDashUtilDashRuntimeLib.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  val files: js.Array[UpdateFileInfo]
  /** @deprecated */
  val path: java.lang.String
  /**
    * The release date.
    */
  var releaseDate: java.lang.String
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
    */
  var releaseNotes: js.UndefOr[java.lang.String | js.Array[ReleaseNoteInfo] | scala.Null] = js.undefined
  /** @deprecated */
  val sha512: java.lang.String
  /**
    * The [staged rollout](/auto-update#staged-rollouts) percentage, 0-100.
    */
  val stagingPercentage: js.UndefOr[scala.Double] = js.undefined
  /**
    * The version.
    */
  val version: java.lang.String
}

object UpdateInfo {
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: java.lang.String,
    releaseDate: java.lang.String,
    sha512: java.lang.String,
    version: java.lang.String,
    releaseName: java.lang.String = null,
    releaseNotes: java.lang.String | js.Array[ReleaseNoteInfo] = null,
    stagingPercentage: scala.Int | scala.Double = null
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(files = files, path = path, releaseDate = releaseDate, sha512 = sha512, version = version)
    if (releaseName != null) __obj.updateDynamic("releaseName")(releaseName)
    if (releaseNotes != null) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (stagingPercentage != null) __obj.updateDynamic("stagingPercentage")(stagingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

