package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentSummary extends js.Object {
  /**
    * When the experiment was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the experiment as displayed. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  var ExperimentSource: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentSource] = js.native
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
}

object ExperimentSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DisplayName: ExperimentEntityName = null,
    ExperimentArn: ExperimentArn = null,
    ExperimentName: ExperimentEntityName = null,
    ExperimentSource: ExperimentSource = null,
    LastModifiedTime: Timestamp = null
  ): ExperimentSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ExperimentArn != null) __obj.updateDynamic("ExperimentArn")(ExperimentArn.asInstanceOf[js.Any])
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (ExperimentSource != null) __obj.updateDynamic("ExperimentSource")(ExperimentSource.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentSummary]
  }
}

