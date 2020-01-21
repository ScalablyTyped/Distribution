package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcEndpointServiceConfigurationsResult extends js.Object {
  /**
    * Information about the service configurations that were not deleted, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}

object DeleteVpcEndpointServiceConfigurationsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): DeleteVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointServiceConfigurationsResult]
  }
}

