package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesListingsRequest extends StObject {
  
  /**
    * One or more filters.    reserved-instances-id - The ID of the Reserved Instances.    reserved-instances-listing-id - The ID of the Reserved Instances listing.    status - The status of the Reserved Instance listing (pending | active | cancelled | closed).    status-message - The reason for the status.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * One or more Reserved Instance IDs.
    */
  var ReservedInstancesId: js.UndefOr[ReservationId] = js.native
  
  /**
    * One or more Reserved Instance listing IDs.
    */
  var ReservedInstancesListingId: js.UndefOr[typings.awsSdk.ec2Mod.ReservedInstancesListingId] = js.native
}
object DescribeReservedInstancesListingsRequest {
  
  @scala.inline
  def apply(): DescribeReservedInstancesListingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesListingsRequest]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesListingsRequestMutableBuilder[Self <: DescribeReservedInstancesListingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesId(value: ReservationId): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
    
    @scala.inline
    def setReservedInstancesListingId(value: ReservedInstancesListingId): Self = StObject.set(x, "ReservedInstancesListingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesListingIdUndefined: Self = StObject.set(x, "ReservedInstancesListingId", js.undefined)
  }
}
