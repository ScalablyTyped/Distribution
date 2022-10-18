package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssistantRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
}
object GetAssistantRequest {
  
  inline def apply(assistantId: UuidOrArn): GetAssistantRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssistantRequest]
  }
  
  extension [Self <: GetAssistantRequest](x: Self) {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
  }
}
