package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponent extends js.Object {
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
    * The input artifacts of the component.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the component was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The metrics for the component.
    */
  var Metrics: js.UndefOr[TrialComponentMetricSummaries] = js.native
  /**
    * The output artifacts of the component.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The hyperparameters of the component.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.native
  /**
    * An array of the parents of the component. A parent is a trial the component is associated with and the experiment the trial is part of. A component might not have any parents.
    */
  var Parents: js.UndefOr[typings.awsSdk.sagemakerMod.Parents] = js.native
  var Source: js.UndefOr[TrialComponentSource] = js.native
  /**
    * The source of the trial component.&gt;
    */
  var SourceDetail: js.UndefOr[TrialComponentSourceDetail] = js.native
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  /**
    * The list of tags that are associated with the component. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.native
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.native
}

object TrialComponent {
  @scala.inline
  def apply(
    CreatedBy: UserContext = null,
    CreationTime: Timestamp = null,
    DisplayName: ExperimentEntityName = null,
    EndTime: Timestamp = null,
    InputArtifacts: TrialComponentArtifacts = null,
    LastModifiedBy: UserContext = null,
    LastModifiedTime: Timestamp = null,
    Metrics: TrialComponentMetricSummaries = null,
    OutputArtifacts: TrialComponentArtifacts = null,
    Parameters: TrialComponentParameters = null,
    Parents: Parents = null,
    Source: TrialComponentSource = null,
    SourceDetail: TrialComponentSourceDetail = null,
    StartTime: Timestamp = null,
    Status: TrialComponentStatus = null,
    Tags: TagList = null,
    TrialComponentArn: TrialComponentArn = null,
    TrialComponentName: ExperimentEntityName = null
  ): TrialComponent = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InputArtifacts != null) __obj.updateDynamic("InputArtifacts")(InputArtifacts.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OutputArtifacts != null) __obj.updateDynamic("OutputArtifacts")(OutputArtifacts.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (Parents != null) __obj.updateDynamic("Parents")(Parents.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (SourceDetail != null) __obj.updateDynamic("SourceDetail")(SourceDetail.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    if (TrialComponentName != null) __obj.updateDynamic("TrialComponentName")(TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponent]
  }
}

