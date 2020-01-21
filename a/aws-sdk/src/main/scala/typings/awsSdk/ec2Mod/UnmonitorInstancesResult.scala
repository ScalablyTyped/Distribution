package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmonitorInstancesResult extends js.Object {
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.native
}

object UnmonitorInstancesResult {
  @scala.inline
  def apply(InstanceMonitorings: InstanceMonitoringList = null): UnmonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceMonitorings != null) __obj.updateDynamic("InstanceMonitorings")(InstanceMonitorings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmonitorInstancesResult]
  }
}

