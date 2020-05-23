package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCapacityReservationAttributesResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object ModifyInstanceCapacityReservationAttributesResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): ModifyInstanceCapacityReservationAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesResult]
  }
}

