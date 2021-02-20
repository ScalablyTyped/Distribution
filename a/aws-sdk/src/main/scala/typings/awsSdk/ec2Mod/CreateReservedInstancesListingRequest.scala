package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReservedInstancesListingRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: String = js.native
  
  /**
    * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance ID specified in this call.
    */
  var InstanceCount: Integer = js.native
  
  /**
    * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance term.
    */
  var PriceSchedules: PriceScheduleSpecificationList = js.native
  
  /**
    * The ID of the active Standard Reserved Instance.
    */
  var ReservedInstancesId: ReservationId = js.native
}
object CreateReservedInstancesListingRequest {
  
  @scala.inline
  def apply(
    ClientToken: String,
    InstanceCount: Integer,
    PriceSchedules: PriceScheduleSpecificationList,
    ReservedInstancesId: ReservationId
  ): CreateReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], InstanceCount = InstanceCount.asInstanceOf[js.Any], PriceSchedules = PriceSchedules.asInstanceOf[js.Any], ReservedInstancesId = ReservedInstancesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReservedInstancesListingRequest]
  }
  
  @scala.inline
  implicit class CreateReservedInstancesListingRequestMutableBuilder[Self <: CreateReservedInstancesListingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceSchedules(value: PriceScheduleSpecificationList): Self = StObject.set(x, "PriceSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceSchedulesVarargs(value: PriceScheduleSpecification*): Self = StObject.set(x, "PriceSchedules", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesId(value: ReservationId): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
  }
}
