package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceUpdate extends StObject {
  
  /**
    * The notes associated with a choice.
    */
  var Notes: js.UndefOr[ChoiceNotes] = js.undefined
  
  /**
    * The reason why a choice is non-applicable to a question in your workload.
    */
  var Reason: js.UndefOr[ChoiceReason] = js.undefined
  
  /**
    * The status of a choice.
    */
  var Status: ChoiceStatus
}
object ChoiceUpdate {
  
  inline def apply(Status: ChoiceStatus): ChoiceUpdate = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceUpdate]
  }
  
  extension [Self <: ChoiceUpdate](x: Self) {
    
    inline def setNotes(value: ChoiceNotes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setReason(value: ChoiceReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: ChoiceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
