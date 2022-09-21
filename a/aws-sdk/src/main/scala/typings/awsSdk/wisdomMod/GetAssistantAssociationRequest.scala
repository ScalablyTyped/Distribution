package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssistantAssociationRequest extends StObject {
  
  /**
    * The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantAssociationId: UuidOrArn
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
}
object GetAssistantAssociationRequest {
  
  inline def apply(assistantAssociationId: UuidOrArn, assistantId: UuidOrArn): GetAssistantAssociationRequest = {
    val __obj = js.Dynamic.literal(assistantAssociationId = assistantAssociationId.asInstanceOf[js.Any], assistantId = assistantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssistantAssociationRequest]
  }
  
  extension [Self <: GetAssistantAssociationRequest](x: Self) {
    
    inline def setAssistantAssociationId(value: UuidOrArn): Self = StObject.set(x, "assistantAssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
  }
}
