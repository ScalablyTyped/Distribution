package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCorsPolicyInput extends js.Object {
  /**
    * The name of the container to remove the policy from.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object DeleteCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCorsPolicyInput]
  }
}

