package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrialComponentRequest extends js.Object {
  /**
    * The name of the component as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types.
    */
  var InputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
    */
  var OutputArtifacts: js.UndefOr[TrialComponentArtifacts] = js.native
  /**
    * The hyperparameters for the component.
    */
  var Parameters: js.UndefOr[TrialComponentParameters] = js.native
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the component. States include:   InProgress   Completed   Failed  
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.native
  /**
    * A list of tags to associate with the component. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}

object CreateTrialComponentRequest {
  @scala.inline
  def apply(
    TrialComponentName: ExperimentEntityName,
    DisplayName: ExperimentEntityName = null,
    EndTime: Timestamp = null,
    InputArtifacts: TrialComponentArtifacts = null,
    OutputArtifacts: TrialComponentArtifacts = null,
    Parameters: TrialComponentParameters = null,
    StartTime: Timestamp = null,
    Status: TrialComponentStatus = null,
    Tags: TagList = null
  ): CreateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InputArtifacts != null) __obj.updateDynamic("InputArtifacts")(InputArtifacts.asInstanceOf[js.Any])
    if (OutputArtifacts != null) __obj.updateDynamic("OutputArtifacts")(OutputArtifacts.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialComponentRequest]
  }
}

