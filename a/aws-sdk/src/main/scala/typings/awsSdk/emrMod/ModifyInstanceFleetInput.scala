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
}

