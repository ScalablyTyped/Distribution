package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSummary extends js.Object {
  /**
    * Who created the component.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the component was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the component as displayed. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Who last modified the component.
    */
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the component was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the component. States include:   InProgress   Completed   Failed  
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.native
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.native
  var TrialComponentSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSource] = js.native
}

object TrialComponentSummary {
  @scala.inline
  def apply(
    CreatedBy: UserContext = null,
    CreationTime: Timestamp = null,
    DisplayName: ExperimentEntityName = null,
    EndTime: Timestamp = null,
    LastModifiedBy: UserContext = null,
    LastModifiedTime: Timestamp = null,
    StartTime: Timestamp = null,
    Status: TrialComponentStatus = null,
    TrialComponentArn: TrialComponentArn = null,
    TrialComponentName: ExperimentEntityName = null,
    TrialComponentSource: TrialComponentSource = null
  ): TrialComponentSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    if (TrialComponentName != null) __obj.updateDynamic("TrialComponentName")(TrialComponentName.asInstanceOf[js.Any])
    if (TrialComponentSource != null) __obj.updateDynamic("TrialComponentSource")(TrialComponentSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSummary]
  }
}

