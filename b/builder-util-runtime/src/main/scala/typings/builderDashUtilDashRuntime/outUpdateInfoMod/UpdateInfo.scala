package typings.builderDashUtilDashRuntime.outUpdateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  val files: js.Array[UpdateFileInfo]
  /** @deprecated */
  val path: String
  /**
    * The release date.
    */
  var releaseDate: String
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[String | Null] = js.undefined
  /**
    * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
    */
  var releaseNotes: js.UndefOr[String | js.Array[ReleaseNoteInfo] | Null] = js.undefined
  /** @deprecated */
  val sha512: String
  /**
    * The [staged rollout](/auto-update#staged-rollouts) percentage, 0-100.
    */
  val stagingPercentage: js.UndefOr[Double] = js.undefined
  /**
    * The version.
    */
  val version: String
}

object UpdateInfo {
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: String,
    releaseDate: String,
    sha512: String,
    version: String,
    releaseName: String = null,
    releaseNotes: String | js.Array[ReleaseNoteInfo] = null,
    stagingPercentage: Int | Double = null
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(files = files, path = path, releaseDate = releaseDate, sha512 = sha512, version = version)
    if (releaseName != null) __obj.updateDynamic("releaseName")(releaseName)
    if (releaseNotes != null) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (stagingPercentage != null) __obj.updateDynamic("stagingPercentage")(stagingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

