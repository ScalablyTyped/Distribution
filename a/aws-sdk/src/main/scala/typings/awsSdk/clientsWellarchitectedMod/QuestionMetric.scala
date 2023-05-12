package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionMetric extends StObject {
  
  /**
    * The best practices, or choices, that have been identified as contributing to risk in a question.
    */
  var BestPractices: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.BestPractices] = js.undefined
  
  var QuestionId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionId] = js.undefined
  
  var Risk: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Risk] = js.undefined
}
object QuestionMetric {
  
  inline def apply(): QuestionMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionMetric] (val x: Self) extends AnyVal {
    
    inline def setBestPractices(value: BestPractices): Self = StObject.set(x, "BestPractices", value.asInstanceOf[js.Any])
    
    inline def setBestPracticesUndefined: Self = StObject.set(x, "BestPractices", js.undefined)
    
    inline def setBestPracticesVarargs(value: BestPractice*): Self = StObject.set(x, "BestPractices", js.Array(value*))
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "QuestionId", js.undefined)
    
    inline def setRisk(value: Risk): Self = StObject.set(x, "Risk", value.asInstanceOf[js.Any])
    
    inline def setRiskUndefined: Self = StObject.set(x, "Risk", js.undefined)
  }
}
