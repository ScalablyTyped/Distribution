package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobBookmarkEntry extends js.Object {
  /**
    * The attempt ID number.
    */
  var Attempt: js.UndefOr[IntegerValue] = js.native
  /**
    * The bookmark itself.
    */
  var JobBookmark: js.UndefOr[JsonValue] = js.native
  /**
    * The name of the job in question.
    */
  var JobName: js.UndefOr[typings.awsSdk.glueMod.JobName] = js.native
  /**
    * The unique run identifier associated with the previous job run.
    */
  var PreviousRunId: js.UndefOr[RunId] = js.native
  /**
    * The run ID number.
    */
  var Run: js.UndefOr[IntegerValue] = js.native
  /**
    * The run ID number.
    */
  var RunId: js.UndefOr[typings.awsSdk.glueMod.RunId] = js.native
  /**
    * The version of the job.
    */
  var Version: js.UndefOr[IntegerValue] = js.native
}

object JobBookmarkEntry {
  @scala.inline
  def apply(
    Attempt: Int | Double = null,
    JobBookmark: JsonValue = null,
    JobName: JobName = null,
    PreviousRunId: RunId = null,
    Run: Int | Double = null,
    RunId: RunId = null,
    Version: Int | Double = null
  ): JobBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    if (Attempt != null) __obj.updateDynamic("Attempt")(Attempt.asInstanceOf[js.Any])
    if (JobBookmark != null) __obj.updateDynamic("JobBookmark")(JobBookmark.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (PreviousRunId != null) __obj.updateDynamic("PreviousRunId")(PreviousRunId.asInstanceOf[js.Any])
    if (Run != null) __obj.updateDynamic("Run")(Run.asInstanceOf[js.Any])
    if (RunId != null) __obj.updateDynamic("RunId")(RunId.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobBookmarkEntry]
  }
}

