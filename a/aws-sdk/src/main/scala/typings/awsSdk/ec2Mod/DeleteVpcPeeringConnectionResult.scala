package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcPeeringConnectionResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object DeleteVpcPeeringConnectionResult {
  @scala.inline
  def apply(Return: js.UndefOr[scala.Boolean] = js.undefined): DeleteVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcPeeringConnectionResult]
  }
}

