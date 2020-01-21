package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationResponse extends js.Object {
  /**
    * A complex type that contains information about the operation.
    */
  var Operation: js.UndefOr[typings.awsSdk.servicediscoveryMod.Operation] = js.native
}

object GetOperationResponse {
  @scala.inline
  def apply(Operation: Operation = null): GetOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (Operation != null) __obj.updateDynamic("Operation")(Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationResponse]
  }
}

