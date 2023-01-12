package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssistantResponse extends StObject {
  
  /**
    * Information about the assistant.
    */
  var assistant: js.UndefOr[AssistantData] = js.undefined
}
object GetAssistantResponse {
  
  inline def apply(): GetAssistantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssistantResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssistantResponse] (val x: Self) extends AnyVal {
    
    inline def setAssistant(value: AssistantData): Self = StObject.set(x, "assistant", value.asInstanceOf[js.Any])
    
    inline def setAssistantUndefined: Self = StObject.set(x, "assistant", js.undefined)
  }
}
