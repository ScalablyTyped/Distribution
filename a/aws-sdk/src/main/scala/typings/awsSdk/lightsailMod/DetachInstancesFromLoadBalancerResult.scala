package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachInstancesFromLoadBalancerResult extends js.Object {
  /**
    * An object describing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object DetachInstancesFromLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): DetachInstancesFromLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachInstancesFromLoadBalancerResult]
  }
}

