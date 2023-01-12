package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceAnswerSummary extends StObject {
  
  var ChoiceId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ChoiceId] = js.undefined
  
  /**
    * The reason why a choice is non-applicable to a question in your workload.
    */
  var Reason: js.UndefOr[ChoiceReason] = js.undefined
  
  /**
    * The status of a choice.
    */
  var Status: js.UndefOr[ChoiceStatus] = js.undefined
}
object ChoiceAnswerSummary {
  
  inline def apply(): ChoiceAnswerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceAnswerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoiceAnswerSummary] (val x: Self) extends AnyVal {
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "ChoiceId", js.undefined)
    
    inline def setReason(value: ChoiceReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: ChoiceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
