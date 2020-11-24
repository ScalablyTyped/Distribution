package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowEntitlementRequest extends js.Object {
  
  /**
    * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The type of encryption that will be used on the output associated with this entitlement.
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.native
  
  /**
    * The ARN of the entitlement that you want to update.
    */
  var EntitlementArn: string = js.native
  
  /**
    * An indication of whether you want to enable the entitlement to allow access, or disable it to stop streaming content to the subscriber’s flow temporarily. If you don’t specify the entitlementStatus field in your request, MediaConnect leaves the value unchanged.
    */
  var EntitlementStatus: js.UndefOr[typings.awsSdk.mediaconnectMod.EntitlementStatus] = js.native
  
  /**
    * The flow that is associated with the entitlement that you want to update.
    */
  var FlowArn: string = js.native
  
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
    */
  var Subscribers: js.UndefOr[listOfString] = js.native
}
object UpdateFlowEntitlementRequest {
  
  @scala.inline
  def apply(EntitlementArn: string, FlowArn: string): UpdateFlowEntitlementRequest = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowEntitlementRequest]
  }
  
  @scala.inline
  implicit class UpdateFlowEntitlementRequestOps[Self <: UpdateFlowEntitlementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntitlementArn(value: string): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEncryption(value: UpdateEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setEntitlementStatus(value: EntitlementStatus): Self = this.set("EntitlementStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitlementStatus: Self = this.set("EntitlementStatus", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: string*): Self = this.set("Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: listOfString): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribers: Self = this.set("Subscribers", js.undefined)
  }
}
