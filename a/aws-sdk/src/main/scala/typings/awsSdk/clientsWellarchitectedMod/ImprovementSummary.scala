package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImprovementSummary extends StObject {
  
  var ImprovementPlanUrl: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ImprovementPlanUrl] = js.undefined
  
  /**
    * The improvement plan details.
    */
  var ImprovementPlans: js.UndefOr[ChoiceImprovementPlans] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarId] = js.undefined
  
  var QuestionId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionId] = js.undefined
  
  var QuestionTitle: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionTitle] = js.undefined
  
  var Risk: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Risk] = js.undefined
}
object ImprovementSummary {
  
  inline def apply(): ImprovementSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImprovementSummary]
  }
  
  extension [Self <: ImprovementSummary](x: Self) {
    
    inline def setImprovementPlanUrl(value: ImprovementPlanUrl): Self = StObject.set(x, "ImprovementPlanUrl", value.asInstanceOf[js.Any])
    
    inline def setImprovementPlanUrlUndefined: Self = StObject.set(x, "ImprovementPlanUrl", js.undefined)
    
    inline def setImprovementPlans(value: ChoiceImprovementPlans): Self = StObject.set(x, "ImprovementPlans", value.asInstanceOf[js.Any])
    
    inline def setImprovementPlansUndefined: Self = StObject.set(x, "ImprovementPlans", js.undefined)
    
    inline def setImprovementPlansVarargs(value: ChoiceImprovementPlan*): Self = StObject.set(x, "ImprovementPlans", js.Array(value*))
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "QuestionId", js.undefined)
    
    inline def setQuestionTitle(value: QuestionTitle): Self = StObject.set(x, "QuestionTitle", value.asInstanceOf[js.Any])
    
    inline def setQuestionTitleUndefined: Self = StObject.set(x, "QuestionTitle", js.undefined)
    
    inline def setRisk(value: Risk): Self = StObject.set(x, "Risk", value.asInstanceOf[js.Any])
    
    inline def setRiskUndefined: Self = StObject.set(x, "Risk", js.undefined)
  }
}
