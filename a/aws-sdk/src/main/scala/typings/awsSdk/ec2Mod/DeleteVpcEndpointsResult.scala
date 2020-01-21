package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcEndpointsResult extends js.Object {
  /**
    * Information about the VPC endpoints that were not successfully deleted.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}

object DeleteVpcEndpointsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): DeleteVpcEndpointsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointsResult]
  }
}

