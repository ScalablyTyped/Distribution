package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckCapacityResponse extends js.Object {
  /**
    * The capacity required by the rules and scope.
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.native
}

object CheckCapacityResponse {
  @scala.inline
  def apply(Capacity: js.UndefOr[ConsumedCapacity] = js.undefined): CheckCapacityResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Capacity)) __obj.updateDynamic("Capacity")(Capacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckCapacityResponse]
  }
}

