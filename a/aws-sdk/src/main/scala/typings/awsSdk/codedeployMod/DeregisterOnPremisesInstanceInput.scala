package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterOnPremisesInstanceInput extends js.Object {
  /**
    * The name of the on-premises instance to deregister.
    */
  var instanceName: InstanceName = js.native
}

object DeregisterOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): DeregisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterOnPremisesInstanceInput]
  }
  @scala.inline
  implicit class DeregisterOnPremisesInstanceInputOps[Self <: DeregisterOnPremisesInstanceInput] (val x: Self) extends AnyVal {
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
    def setInstanceName(value: InstanceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
  }
  
}

