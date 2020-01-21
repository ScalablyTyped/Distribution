package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesListingsResult extends js.Object {
  /**
    * Information about the Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.native
}

object DescribeReservedInstancesListingsResult {
  @scala.inline
  def apply(ReservedInstancesListings: ReservedInstancesListingList = null): DescribeReservedInstancesListingsResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesListings != null) __obj.updateDynamic("ReservedInstancesListings")(ReservedInstancesListings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedInstancesListingsResult]
  }
}

