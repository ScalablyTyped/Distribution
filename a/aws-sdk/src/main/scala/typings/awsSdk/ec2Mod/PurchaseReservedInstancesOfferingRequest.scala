package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedInstancesOfferingRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of Reserved Instances to purchase.
    */
  var InstanceCount: Integer = js.native
  
  /**
    * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved Instances are not purchased at unexpected prices.
    */
  var LimitPrice: js.UndefOr[ReservedInstanceLimitPrice] = js.native
  
  /**
    * The time at which to purchase the Reserved Instance, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var PurchaseTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The ID of the Reserved Instance offering to purchase.
    */
  var ReservedInstancesOfferingId: typings.awsSdk.ec2Mod.ReservedInstancesOfferingId = js.native
}
object PurchaseReservedInstancesOfferingRequest {
  
  @scala.inline
  def apply(InstanceCount: Integer, ReservedInstancesOfferingId: ReservedInstancesOfferingId): PurchaseReservedInstancesOfferingRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], ReservedInstancesOfferingId = ReservedInstancesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingRequest]
  }
  
  @scala.inline
  implicit class PurchaseReservedInstancesOfferingRequestMutableBuilder[Self <: PurchaseReservedInstancesOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitPrice(value: ReservedInstanceLimitPrice): Self = StObject.set(x, "LimitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitPriceUndefined: Self = StObject.set(x, "LimitPrice", js.undefined)
    
    @scala.inline
    def setPurchaseTime(value: DateTime): Self = StObject.set(x, "PurchaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTimeUndefined: Self = StObject.set(x, "PurchaseTime", js.undefined)
    
    @scala.inline
    def setReservedInstancesOfferingId(value: ReservedInstancesOfferingId): Self = StObject.set(x, "ReservedInstancesOfferingId", value.asInstanceOf[js.Any])
  }
}
