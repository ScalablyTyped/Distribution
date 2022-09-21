package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactFlowModuleContentRequest extends StObject {
  
  /**
    * The identifier of the flow module.
    */
  var ContactFlowModuleId: typings.awsSdk.connectMod.ContactFlowModuleId
  
  /**
    * The content of the flow module.
    */
  var Content: ContactFlowModuleContent
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object UpdateContactFlowModuleContentRequest {
  
  inline def apply(
    ContactFlowModuleId: ContactFlowModuleId,
    Content: ContactFlowModuleContent,
    InstanceId: InstanceId
  ): UpdateContactFlowModuleContentRequest = {
    val __obj = js.Dynamic.literal(ContactFlowModuleId = ContactFlowModuleId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactFlowModuleContentRequest]
  }
  
  extension [Self <: UpdateContactFlowModuleContentRequest](x: Self) {
    
    inline def setContactFlowModuleId(value: ContactFlowModuleId): Self = StObject.set(x, "ContactFlowModuleId", value.asInstanceOf[js.Any])
    
    inline def setContent(value: ContactFlowModuleContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
