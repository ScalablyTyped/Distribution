package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachInstancesToLoadBalancerResult extends js.Object {
  /**
    * An object representing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object AttachInstancesToLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): AttachInstancesToLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInstancesToLoadBalancerResult]
  }
}

