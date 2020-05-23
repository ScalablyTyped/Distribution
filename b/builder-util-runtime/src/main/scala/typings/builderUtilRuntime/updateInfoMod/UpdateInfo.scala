package typings.builderUtilRuntime.updateInfoMod

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
    releaseName: js.UndefOr[Null | String] = js.undefined,
    releaseNotes: js.UndefOr[Null | String | js.Array[ReleaseNoteInfo]] = js.undefined,
    stagingPercentage: js.UndefOr[Double] = js.undefined
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseName)) __obj.updateDynamic("releaseName")(releaseName.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseNotes)) __obj.updateDynamic("releaseNotes")(releaseNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(stagingPercentage)) __obj.updateDynamic("stagingPercentage")(stagingPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

