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
  @scala.inline
  implicit class PutLifecyclePolicyInputOps[Self <: PutLifecyclePolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerName(value: ContainerName): Self = this.set("ContainerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecyclePolicy(value: LifecyclePolicy): Self = this.set("LifecyclePolicy", value.asInstanceOf[js.Any])
  }
  
}

