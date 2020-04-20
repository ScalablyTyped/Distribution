package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTerminationProtectionInput extends js.Object {
  /**
    * Whether to enable termination protection on the specified stack.
    */
  var EnableTerminationProtection: typings.awsSdk.cloudformationMod.EnableTerminationProtection = js.native
  /**
    * The name or unique ID of the stack for which you want to set termination protection.
    */
  var StackName: StackNameOrId = js.native
}

object UpdateTerminationProtectionInput {
  @scala.inline
  def apply(EnableTerminationProtection: EnableTerminationProtection, StackName: StackNameOrId): UpdateTerminationProtectionInput = {
    val __obj = js.Dynamic.literal(EnableTerminationProtection = EnableTerminationProtection.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTerminationProtectionInput]
  }
}

