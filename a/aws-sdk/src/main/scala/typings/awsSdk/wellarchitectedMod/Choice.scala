package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Choice extends StObject {
  
  /**
    * The additional resources for a choice. A choice can have up to two additional resources: one of type HELPFUL_RESOURCE, one of type IMPROVEMENT_PLAN, or both.
    */
  var AdditionalResources: js.UndefOr[AdditionalResourcesList] = js.undefined
  
  var ChoiceId: js.UndefOr[typings.awsSdk.wellarchitectedMod.ChoiceId] = js.undefined
  
  var Description: js.UndefOr[ChoiceDescription] = js.undefined
  
  /**
    * The choice level helpful resource.
    */
  var HelpfulResource: js.UndefOr[ChoiceContent] = js.undefined
  
  /**
    * The choice level improvement plan.
    */
  var ImprovementPlan: js.UndefOr[ChoiceContent] = js.undefined
  
  var Title: js.UndefOr[ChoiceTitle] = js.undefined
}
object Choice {
  
  inline def apply(): Choice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Choice]
  }
  
  extension [Self <: Choice](x: Self) {
    
    inline def setAdditionalResources(value: AdditionalResourcesList): Self = StObject.set(x, "AdditionalResources", value.asInstanceOf[js.Any])
    
    inline def setAdditionalResourcesUndefined: Self = StObject.set(x, "AdditionalResources", js.undefined)
    
    inline def setAdditionalResourcesVarargs(value: AdditionalResources*): Self = StObject.set(x, "AdditionalResources", js.Array(value*))
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "ChoiceId", js.undefined)
    
    inline def setDescription(value: ChoiceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHelpfulResource(value: ChoiceContent): Self = StObject.set(x, "HelpfulResource", value.asInstanceOf[js.Any])
    
    inline def setHelpfulResourceUndefined: Self = StObject.set(x, "HelpfulResource", js.undefined)
    
    inline def setImprovementPlan(value: ChoiceContent): Self = StObject.set(x, "ImprovementPlan", value.asInstanceOf[js.Any])
    
    inline def setImprovementPlanUndefined: Self = StObject.set(x, "ImprovementPlan", js.undefined)
    
    inline def setTitle(value: ChoiceTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
