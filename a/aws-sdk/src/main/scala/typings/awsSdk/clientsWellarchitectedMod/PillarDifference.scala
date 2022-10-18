package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PillarDifference extends StObject {
  
  /**
    * Indicates the type of change to the pillar.
    */
  var DifferenceStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.DifferenceStatus] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarId] = js.undefined
  
  var PillarName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarName] = js.undefined
  
  /**
    * List of question differences.
    */
  var QuestionDifferences: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionDifferences] = js.undefined
}
object PillarDifference {
  
  inline def apply(): PillarDifference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PillarDifference]
  }
  
  extension [Self <: PillarDifference](x: Self) {
    
    inline def setDifferenceStatus(value: DifferenceStatus): Self = StObject.set(x, "DifferenceStatus", value.asInstanceOf[js.Any])
    
    inline def setDifferenceStatusUndefined: Self = StObject.set(x, "DifferenceStatus", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setPillarName(value: PillarName): Self = StObject.set(x, "PillarName", value.asInstanceOf[js.Any])
    
    inline def setPillarNameUndefined: Self = StObject.set(x, "PillarName", js.undefined)
    
    inline def setQuestionDifferences(value: QuestionDifferences): Self = StObject.set(x, "QuestionDifferences", value.asInstanceOf[js.Any])
    
    inline def setQuestionDifferencesUndefined: Self = StObject.set(x, "QuestionDifferences", js.undefined)
    
    inline def setQuestionDifferencesVarargs(value: QuestionDifference*): Self = StObject.set(x, "QuestionDifferences", js.Array(value*))
  }
}
