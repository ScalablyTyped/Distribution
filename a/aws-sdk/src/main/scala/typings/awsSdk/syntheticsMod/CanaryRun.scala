package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRun extends js.Object {
  /**
    * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: js.UndefOr[String] = js.native
  /**
    * The name of the canary.
    */
  var Name: js.UndefOr[CanaryName] = js.native
  /**
    * The status of this run.
    */
  var Status: js.UndefOr[CanaryRunStatus] = js.native
  /**
    * A structure that contains the start and end times of this run.
    */
  var Timeline: js.UndefOr[CanaryRunTimeline] = js.native
}

object CanaryRun {
  @scala.inline
  def apply(
    ArtifactS3Location: String = null,
    Name: CanaryName = null,
    Status: CanaryRunStatus = null,
    Timeline: CanaryRunTimeline = null
  ): CanaryRun = {
    val __obj = js.Dynamic.literal()
    if (ArtifactS3Location != null) __obj.updateDynamic("ArtifactS3Location")(ArtifactS3Location.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRun]
  }
}

