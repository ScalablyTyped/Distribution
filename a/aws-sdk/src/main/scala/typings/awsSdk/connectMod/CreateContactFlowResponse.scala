package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactFlowResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var ContactFlowArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the contact flow.
    */
  var ContactFlowId: js.UndefOr[typings.awsSdk.connectMod.ContactFlowId] = js.undefined
}
object CreateContactFlowResponse {
  
  inline def apply(): CreateContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactFlowResponse]
  }
  
  extension [Self <: CreateContactFlowResponse](x: Self) {
    
    inline def setContactFlowArn(value: ARN): Self = StObject.set(x, "ContactFlowArn", value.asInstanceOf[js.Any])
    
    inline def setContactFlowArnUndefined: Self = StObject.set(x, "ContactFlowArn", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContactFlowIdUndefined: Self = StObject.set(x, "ContactFlowId", js.undefined)
  }
}
