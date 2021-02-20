package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTriggersResponse extends StObject {
  
  /**
    * A continuation token, if not all the requested triggers have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * A list of triggers for the specified job.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
}
object GetTriggersResponse {
  
  @scala.inline
  def apply(): GetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggersResponse]
  }
  
  @scala.inline
  implicit class GetTriggersResponseMutableBuilder[Self <: GetTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTriggers(value: TriggerList): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "Triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: Trigger*): Self = StObject.set(x, "Triggers", js.Array(value :_*))
  }
}
