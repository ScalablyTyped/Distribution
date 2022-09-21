package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionDifference extends StObject {
  
  /**
    * Indicates the type of change to the question.
    */
  var DifferenceStatus: js.UndefOr[typings.awsSdk.wellarchitectedMod.DifferenceStatus] = js.undefined
  
  var QuestionId: js.UndefOr[typings.awsSdk.wellarchitectedMod.QuestionId] = js.undefined
  
  var QuestionTitle: js.UndefOr[typings.awsSdk.wellarchitectedMod.QuestionTitle] = js.undefined
}
object QuestionDifference {
  
  inline def apply(): QuestionDifference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionDifference]
  }
  
  extension [Self <: QuestionDifference](x: Self) {
    
    inline def setDifferenceStatus(value: DifferenceStatus): Self = StObject.set(x, "DifferenceStatus", value.asInstanceOf[js.Any])
    
    inline def setDifferenceStatusUndefined: Self = StObject.set(x, "DifferenceStatus", js.undefined)
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "QuestionId", js.undefined)
    
    inline def setQuestionTitle(value: QuestionTitle): Self = StObject.set(x, "QuestionTitle", value.asInstanceOf[js.Any])
    
    inline def setQuestionTitleUndefined: Self = StObject.set(x, "QuestionTitle", js.undefined)
  }
}
