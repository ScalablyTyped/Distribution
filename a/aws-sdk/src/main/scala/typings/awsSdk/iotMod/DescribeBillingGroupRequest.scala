package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBillingGroupRequest extends StObject {
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName
}
object DescribeBillingGroupRequest {
  
  @scala.inline
  def apply(billingGroupName: BillingGroupName): DescribeBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBillingGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeBillingGroupRequestMutableBuilder[Self <: DescribeBillingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
  }
}
