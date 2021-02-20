package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactFlowResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var ContactFlowArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the contact flow.
    */
  var ContactFlowId: js.UndefOr[typings.awsSdk.connectMod.ContactFlowId] = js.native
}
object CreateContactFlowResponse {
  
  @scala.inline
  def apply(): CreateContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactFlowResponse]
  }
  
  @scala.inline
  implicit class CreateContactFlowResponseMutableBuilder[Self <: CreateContactFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactFlowArn(value: ARN): Self = StObject.set(x, "ContactFlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactFlowArnUndefined: Self = StObject.set(x, "ContactFlowArn", js.undefined)
    
    @scala.inline
    def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactFlowIdUndefined: Self = StObject.set(x, "ContactFlowId", js.undefined)
  }
}
