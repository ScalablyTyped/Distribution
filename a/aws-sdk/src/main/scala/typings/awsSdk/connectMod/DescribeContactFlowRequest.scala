package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContactFlowRequest extends StObject {
  
  /**
    * The identifier of the contact flow.
    */
  var ContactFlowId: typings.awsSdk.connectMod.ContactFlowId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}
object DescribeContactFlowRequest {
  
  @scala.inline
  def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId): DescribeContactFlowRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactFlowRequest]
  }
  
  @scala.inline
  implicit class DescribeContactFlowRequestMutableBuilder[Self <: DescribeContactFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
