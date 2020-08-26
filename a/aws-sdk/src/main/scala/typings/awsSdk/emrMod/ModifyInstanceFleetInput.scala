package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceFleetInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleet: InstanceFleetModifyConfig = js.native
}

object ModifyInstanceFleetInput {
  @scala.inline
  def apply(ClusterId: ClusterId, InstanceFleet: InstanceFleetModifyConfig): ModifyInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceFleet = InstanceFleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceFleetInput]
  }
  @scala.inline
  implicit class ModifyInstanceFleetInputOps[Self <: ModifyInstanceFleetInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceFleet(value: InstanceFleetModifyConfig): Self = this.set("InstanceFleet", value.asInstanceOf[js.Any])
  }
  
}

