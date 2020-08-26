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
  def apply(TrialComponentName: ExperimentEntityName): CreateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialComponentRequest]
  }
  @scala.inline
  implicit class CreateTrialComponentRequestOps[Self <: CreateTrialComponentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = this.set("TrialComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setInputArtifacts(value: TrialComponentArtifacts): Self = this.set("InputArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputArtifacts: Self = this.set("InputArtifacts", js.undefined)
    @scala.inline
    def setOutputArtifacts(value: TrialComponentArtifacts): Self = this.set("OutputArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("OutputArtifacts", js.undefined)
    @scala.inline
    def setParameters(value: TrialComponentParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: TrialComponentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

