package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesListingsResult extends StObject {
  
  /**
    * Information about the Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.native
}
object DescribeReservedInstancesListingsResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesListingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesListingsResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesListingsResultMutableBuilder[Self <: DescribeReservedInstancesListingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesListings(value: ReservedInstancesListingList): Self = StObject.set(x, "ReservedInstancesListings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesListingsUndefined: Self = StObject.set(x, "ReservedInstancesListings", js.undefined)
    
    @scala.inline
    def setReservedInstancesListingsVarargs(value: ReservedInstancesListing*): Self = StObject.set(x, "ReservedInstancesListings", js.Array(value :_*))
  }
}
