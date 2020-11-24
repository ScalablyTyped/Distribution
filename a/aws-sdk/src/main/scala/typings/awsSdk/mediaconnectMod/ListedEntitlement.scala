package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListedEntitlement extends js.Object {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string = js.native
  
  /**
    * The name of the entitlement.
    */
  var EntitlementName: string = js.native
}
object ListedEntitlement {
  
  @scala.inline
  def apply(EntitlementArn: string, EntitlementName: string): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], EntitlementName = EntitlementName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedEntitlement]
  }
  
  @scala.inline
  implicit class ListedEntitlementOps[Self <: ListedEntitlement] (val x: Self) extends AnyVal {
    
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
    def setEntitlementName(value: string): Self = this.set("EntitlementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = this.set("DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTransferSubscriberFeePercent: Self = this.set("DataTransferSubscriberFeePercent", js.undefined)
  }
}
