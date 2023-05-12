package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PillarMetric extends StObject {
  
  var PillarId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarId] = js.undefined
  
  /**
    * The questions that have been identified as risks in the pillar.
    */
  var Questions: js.UndefOr[QuestionMetrics] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.RiskCounts] = js.undefined
}
object PillarMetric {
  
  inline def apply(): PillarMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PillarMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PillarMetric] (val x: Self) extends AnyVal {
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setQuestions(value: QuestionMetrics): Self = StObject.set(x, "Questions", value.asInstanceOf[js.Any])
    
    inline def setQuestionsUndefined: Self = StObject.set(x, "Questions", js.undefined)
    
    inline def setQuestionsVarargs(value: QuestionMetric*): Self = StObject.set(x, "Questions", js.Array(value*))
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
  }
}
