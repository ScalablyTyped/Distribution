package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReservedInstancesListingResult extends js.Object {
  /**
    * Information about the Standard Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.native
}

object CreateReservedInstancesListingResult {
  @scala.inline
  def apply(ReservedInstancesListings: ReservedInstancesListingList = null): CreateReservedInstancesListingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesListings != null) __obj.updateDynamic("ReservedInstancesListings")(ReservedInstancesListings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReservedInstancesListingResult]
  }
}

