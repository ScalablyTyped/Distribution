package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBillingGroupResponse extends js.Object {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.native
  
  /**
    * Additional information about the billing group.
    */
  var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.native
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.native
  
  /**
    * The version of the billing group.
    */
  var version: js.UndefOr[Version] = js.native
}
object DescribeBillingGroupResponse {
  
  @scala.inline
  def apply(): DescribeBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBillingGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeBillingGroupResponseOps[Self <: DescribeBillingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBillingGroupArn(value: BillingGroupArn): Self = this.set("billingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupArn: Self = this.set("billingGroupArn", js.undefined)
    
    @scala.inline
    def setBillingGroupId(value: BillingGroupId): Self = this.set("billingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupId: Self = this.set("billingGroupId", js.undefined)
    
    @scala.inline
    def setBillingGroupMetadata(value: BillingGroupMetadata): Self = this.set("billingGroupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupMetadata: Self = this.set("billingGroupMetadata", js.undefined)
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupName: Self = this.set("billingGroupName", js.undefined)
    
    @scala.inline
    def setBillingGroupProperties(value: BillingGroupProperties): Self = this.set("billingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupProperties: Self = this.set("billingGroupProperties", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
