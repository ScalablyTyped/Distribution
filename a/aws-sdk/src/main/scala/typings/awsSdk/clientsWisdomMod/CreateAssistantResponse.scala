package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssistantResponse extends StObject {
  
  /**
    * Information about the assistant.
    */
  var assistant: js.UndefOr[AssistantData] = js.undefined
}
object CreateAssistantResponse {
  
  inline def apply(): CreateAssistantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssistantResponse]
  }
  
  extension [Self <: CreateAssistantResponse](x: Self) {
    
    inline def setAssistant(value: AssistantData): Self = StObject.set(x, "assistant", value.asInstanceOf[js.Any])
    
    inline def setAssistantUndefined: Self = StObject.set(x, "assistant", js.undefined)
  }
}
