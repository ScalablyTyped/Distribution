package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopInstanceRequest extends js.Object {
  /**
    * When set to True, forces a Lightsail instance that is stuck in a stopping state to stop.  Only use the force parameter if your instance is stuck in the stopping state. In any other state, your instance should stop normally without adding this parameter to your API request. 
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The name of the instance (a virtual private server) to stop.
    */
  var instanceName: ResourceName = js.native
}

object StopInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstanceRequest]
  }
  @scala.inline
  implicit class StopInstanceRequestOps[Self <: StopInstanceRequest] (val x: Self) extends AnyVal {
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
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
  
}

