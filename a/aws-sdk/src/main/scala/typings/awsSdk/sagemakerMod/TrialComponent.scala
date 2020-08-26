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
  /**
    * The Amazon Resource Name (ARN) and job type of the source of the component.
    */
  var Source: js.UndefOr[TrialComponentSource] = js.native
  /**
    * Details of the source of the component.
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
  def apply(): TrialComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponent]
  }
  @scala.inline
  implicit class TrialComponentOps[Self <: TrialComponent] (val x: Self) extends AnyVal {
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
    def setCreatedBy(value: UserContext): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
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
    def setLastModifiedBy(value: UserContext): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: TrialComponentMetricSummary*): Self = this.set("Metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: TrialComponentMetricSummaries): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setOutputArtifacts(value: TrialComponentArtifacts): Self = this.set("OutputArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("OutputArtifacts", js.undefined)
    @scala.inline
    def setParameters(value: TrialComponentParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setParentsVarargs(value: Parent*): Self = this.set("Parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: Parents): Self = this.set("Parents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParents: Self = this.set("Parents", js.undefined)
    @scala.inline
    def setSource(value: TrialComponentSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setSourceDetail(value: TrialComponentSourceDetail): Self = this.set("SourceDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDetail: Self = this.set("SourceDetail", js.undefined)
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
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = this.set("TrialComponentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentArn: Self = this.set("TrialComponentArn", js.undefined)
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = this.set("TrialComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentName: Self = this.set("TrialComponentName", js.undefined)
  }
  
}

