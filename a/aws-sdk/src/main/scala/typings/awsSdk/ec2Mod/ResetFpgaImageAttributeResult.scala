package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetFpgaImageAttributeResult extends js.Object {
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ResetFpgaImageAttributeResult {
  @scala.inline
  def apply(Return: js.UndefOr[scala.Boolean] = js.undefined): ResetFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetFpgaImageAttributeResult]
  }
}

