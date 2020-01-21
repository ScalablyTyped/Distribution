package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTerminationProtectionOutput extends js.Object {
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
}

object UpdateTerminationProtectionOutput {
  @scala.inline
  def apply(StackId: StackId = null): UpdateTerminationProtectionOutput = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTerminationProtectionOutput]
  }
}

