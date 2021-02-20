package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trial extends StObject {
  
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
  implicit class TrialMutableBuilder[Self <: Trial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setSource(value: TrialSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
    
    @scala.inline
    def setTrialComponentSummaries(value: TrialComponentSimpleSummaries): Self = StObject.set(x, "TrialComponentSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentSummariesUndefined: Self = StObject.set(x, "TrialComponentSummaries", js.undefined)
    
    @scala.inline
    def setTrialComponentSummariesVarargs(value: TrialComponentSimpleSummary*): Self = StObject.set(x, "TrialComponentSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
  }
}
