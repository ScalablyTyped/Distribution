package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBillingGroupResponse extends StObject {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
  
  /**
    * The name you gave to the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
}
object CreateBillingGroupResponse {
  
  @scala.inline
  def apply(): CreateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBillingGroupResponse]
  }
  
  @scala.inline
  implicit class CreateBillingGroupResponseMutableBuilder[Self <: CreateBillingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "billingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupArnUndefined: Self = StObject.set(x, "billingGroupArn", js.undefined)
    
    @scala.inline
    def setBillingGroupId(value: BillingGroupId): Self = StObject.set(x, "billingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupIdUndefined: Self = StObject.set(x, "billingGroupId", js.undefined)
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
  }
}
