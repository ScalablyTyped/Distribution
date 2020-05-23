package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstancePlacementResult extends js.Object {
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ModifyInstancePlacementResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): ModifyInstancePlacementResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementResult]
  }
}

