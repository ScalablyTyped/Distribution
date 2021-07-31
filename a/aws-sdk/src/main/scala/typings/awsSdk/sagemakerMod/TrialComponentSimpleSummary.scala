package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentSimpleSummary extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the component was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.undefined
  
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  var TrialComponentSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSource] = js.undefined
}
object TrialComponentSimpleSummary {
  
  @scala.inline
  def apply(): TrialComponentSimpleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSimpleSummary]
  }
  
  @scala.inline
  implicit class TrialComponentSimpleSummaryMutableBuilder[Self <: TrialComponentSimpleSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentNameUndefined: Self = StObject.set(x, "TrialComponentName", js.undefined)
    
    @scala.inline
    def setTrialComponentSource(value: TrialComponentSource): Self = StObject.set(x, "TrialComponentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentSourceUndefined: Self = StObject.set(x, "TrialComponentSource", js.undefined)
  }
}
