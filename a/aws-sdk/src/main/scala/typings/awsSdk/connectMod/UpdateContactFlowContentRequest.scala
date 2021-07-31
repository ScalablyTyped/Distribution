package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactFlowContentRequest extends StObject {
  
  /**
    * The identifier of the contact flow.
    */
  var ContactFlowId: typings.awsSdk.connectMod.ContactFlowId
  
  /**
    * The JSON string that represents contact flow’s content. For an example, see Example contact flow in Amazon Connect Flow language in the Amazon Connect Administrator Guide. 
    */
  var Content: ContactFlowContent
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object UpdateContactFlowContentRequest {
  
  @scala.inline
  def apply(ContactFlowId: ContactFlowId, Content: ContactFlowContent, InstanceId: InstanceId): UpdateContactFlowContentRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactFlowContentRequest]
  }
  
  @scala.inline
  implicit class UpdateContactFlowContentRequestMutableBuilder[Self <: UpdateContactFlowContentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
