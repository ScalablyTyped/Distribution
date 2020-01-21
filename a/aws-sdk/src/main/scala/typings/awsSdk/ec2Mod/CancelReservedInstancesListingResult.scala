package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelReservedInstancesListingResult extends js.Object {
  /**
    * The Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.native
}

object CancelReservedInstancesListingResult {
  @scala.inline
  def apply(ReservedInstancesListings: ReservedInstancesListingList = null): CancelReservedInstancesListingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesListings != null) __obj.updateDynamic("ReservedInstancesListings")(ReservedInstancesListings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReservedInstancesListingResult]
  }
}

