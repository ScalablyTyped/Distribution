package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trial extends js.Object {
  
  var CreatedBy: js.UndefOr[UserContext] = js.native
  
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The name of the experiment the trial is part of.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  
  /**
    * Who last modified the trial.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  var Source: js.UndefOr[TrialSource] = js.native
  
  /**
    * The list of tags that are associated with the trial. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.native
  
  /**
    * A list of the components associated with the trial. For each component, a summary of the component's properties is included.
    */
  var TrialComponentSummaries: js.UndefOr[TrialComponentSimpleSummaries] = js.native
  
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}
object Trial {
  
  @scala.inline
  def apply(): Trial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trial]
  }
  
  @scala.inline
  implicit class TrialOps[Self <: Trial] (val x: Self) extends AnyVal {
    
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
    def setExperimentName(value: ExperimentEntityName): Self = this.set("ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentName: Self = this.set("ExperimentName", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: UserContext): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setSource(value: TrialSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = this.set("TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialArn: Self = this.set("TrialArn", js.undefined)
    
    @scala.inline
    def setTrialComponentSummariesVarargs(value: TrialComponentSimpleSummary*): Self = this.set("TrialComponentSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTrialComponentSummaries(value: TrialComponentSimpleSummaries): Self = this.set("TrialComponentSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialComponentSummaries: Self = this.set("TrialComponentSummaries", js.undefined)
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = this.set("TrialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialName: Self = this.set("TrialName", js.undefined)
  }
}
