package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelReservedInstancesListingRequest extends StObject {
  
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: typings.awsSdk.ec2Mod.ReservedInstancesListingId = js.native
}
object CancelReservedInstancesListingRequest {
  
  @scala.inline
  def apply(ReservedInstancesListingId: ReservedInstancesListingId): CancelReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesListingId = ReservedInstancesListingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReservedInstancesListingRequest]
  }
  
  @scala.inline
  implicit class CancelReservedInstancesListingRequestMutableBuilder[Self <: CancelReservedInstancesListingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesListingId(value: ReservedInstancesListingId): Self = StObject.set(x, "ReservedInstancesListingId", value.asInstanceOf[js.Any])
  }
}
