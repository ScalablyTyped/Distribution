package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDetails extends js.Object {
  /**
    * Details on the Amazon EC2 resource.
    */
  var EC2ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.EC2ResourceDetails] = js.native
}

object ResourceDetails {
  @scala.inline
  def apply(EC2ResourceDetails: EC2ResourceDetails = null): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (EC2ResourceDetails != null) __obj.updateDynamic("EC2ResourceDetails")(EC2ResourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDetails]
  }
}

