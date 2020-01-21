package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialSummary extends js.Object {
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * When the trial was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
  var TrialSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialSource] = js.native
}

object TrialSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DisplayName: ExperimentEntityName = null,
    LastModifiedTime: Timestamp = null,
    TrialArn: TrialArn = null,
    TrialName: ExperimentEntityName = null,
    TrialSource: TrialSource = null
  ): TrialSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (TrialArn != null) __obj.updateDynamic("TrialArn")(TrialArn.asInstanceOf[js.Any])
    if (TrialName != null) __obj.updateDynamic("TrialName")(TrialName.asInstanceOf[js.Any])
    if (TrialSource != null) __obj.updateDynamic("TrialSource")(TrialSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialSummary]
  }
}

