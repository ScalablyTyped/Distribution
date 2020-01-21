package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachClassicLinkVpcResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object AttachClassicLinkVpcResult {
  @scala.inline
  def apply(Return: js.UndefOr[scala.Boolean] = js.undefined): AttachClassicLinkVpcResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachClassicLinkVpcResult]
  }
}

