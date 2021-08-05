package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetTriggersResponse extends StObject {
  
  /**
    * A list of trigger definitions.
    */
  var Triggers: js.UndefOr[TriggerList] = js.undefined
  
  /**
    * A list of names of triggers not found.
    */
  var TriggersNotFound: js.UndefOr[TriggerNameList] = js.undefined
}
object BatchGetTriggersResponse {
  
  inline def apply(): BatchGetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTriggersResponse]
  }
  
  extension [Self <: BatchGetTriggersResponse](x: Self) {
    
    inline def setTriggers(value: TriggerList): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersNotFound(value: TriggerNameList): Self = StObject.set(x, "TriggersNotFound", value.asInstanceOf[js.Any])
    
    inline def setTriggersNotFoundUndefined: Self = StObject.set(x, "TriggersNotFound", js.undefined)
    
    inline def setTriggersNotFoundVarargs(value: NameString*): Self = StObject.set(x, "TriggersNotFound", js.Array(value :_*))
    
    inline def setTriggersUndefined: Self = StObject.set(x, "Triggers", js.undefined)
    
    inline def setTriggersVarargs(value: Trigger*): Self = StObject.set(x, "Triggers", js.Array(value :_*))
  }
}
