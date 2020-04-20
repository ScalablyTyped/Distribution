package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that you want to assign the object lifecycle policy to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
  /**
    * The object lifecycle policy to apply to the container.
    */
  var LifecyclePolicy: typings.awsSdk.mediastoreMod.LifecyclePolicy = js.native
}

object PutLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, LifecyclePolicy: LifecyclePolicy): PutLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyInput]
  }
}

