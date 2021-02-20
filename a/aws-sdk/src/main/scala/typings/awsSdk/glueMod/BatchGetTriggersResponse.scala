package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetTriggersResponse extends StObject {
  
  /**
    * A list of trigger definitions.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
  
  /**
    * A list of names of triggers not found.
    */
  var TriggersNotFound: js.UndefOr[TriggerNameList] = js.native
}
object BatchGetTriggersResponse {
  
  @scala.inline
  def apply(): BatchGetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTriggersResponse]
  }
  
  @scala.inline
  implicit class BatchGetTriggersResponseMutableBuilder[Self <: BatchGetTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggers(value: TriggerList): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersNotFound(value: TriggerNameList): Self = StObject.set(x, "TriggersNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersNotFoundUndefined: Self = StObject.set(x, "TriggersNotFound", js.undefined)
    
    @scala.inline
    def setTriggersNotFoundVarargs(value: NameString*): Self = StObject.set(x, "TriggersNotFound", js.Array(value :_*))
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "Triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: Trigger*): Self = StObject.set(x, "Triggers", js.Array(value :_*))
  }
}
