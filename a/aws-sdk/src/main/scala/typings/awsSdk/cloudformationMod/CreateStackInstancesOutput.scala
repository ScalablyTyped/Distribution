package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackInstancesOutput extends js.Object {
  /**
    * The unique identifier for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
}

object CreateStackInstancesOutput {
  @scala.inline
  def apply(OperationId: ClientRequestToken = null): CreateStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackInstancesOutput]
  }
}

