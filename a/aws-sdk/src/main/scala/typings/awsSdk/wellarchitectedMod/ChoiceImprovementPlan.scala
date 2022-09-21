package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceImprovementPlan extends StObject {
  
  var ChoiceId: js.UndefOr[typings.awsSdk.wellarchitectedMod.ChoiceId] = js.undefined
  
  /**
    * The display text for the improvement plan.
    */
  var DisplayText: js.UndefOr[typings.awsSdk.wellarchitectedMod.DisplayText] = js.undefined
  
  var ImprovementPlanUrl: js.UndefOr[typings.awsSdk.wellarchitectedMod.ImprovementPlanUrl] = js.undefined
}
object ChoiceImprovementPlan {
  
  inline def apply(): ChoiceImprovementPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceImprovementPlan]
  }
  
  extension [Self <: ChoiceImprovementPlan](x: Self) {
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "ChoiceId", js.undefined)
    
    inline def setDisplayText(value: DisplayText): Self = StObject.set(x, "DisplayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "DisplayText", js.undefined)
    
    inline def setImprovementPlanUrl(value: ImprovementPlanUrl): Self = StObject.set(x, "ImprovementPlanUrl", value.asInstanceOf[js.Any])
    
    inline def setImprovementPlanUrlUndefined: Self = StObject.set(x, "ImprovementPlanUrl", js.undefined)
  }
}
