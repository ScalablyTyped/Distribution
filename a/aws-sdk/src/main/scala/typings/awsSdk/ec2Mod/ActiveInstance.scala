package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveInstance extends js.Object {
  /**
    * The health status of the instance. If the status of either the instance status check or the system status check is impaired, the health status of the instance is unhealthy. Otherwise, the health status is healthy.
    */
  var InstanceHealth: js.UndefOr[InstanceHealthStatus] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
}

object ActiveInstance {
  @scala.inline
  def apply(
    InstanceHealth: InstanceHealthStatus = null,
    InstanceId: String = null,
    InstanceType: String = null,
    SpotInstanceRequestId: String = null
  ): ActiveInstance = {
    val __obj = js.Dynamic.literal()
    if (InstanceHealth != null) __obj.updateDynamic("InstanceHealth")(InstanceHealth.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (SpotInstanceRequestId != null) __obj.updateDynamic("SpotInstanceRequestId")(SpotInstanceRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveInstance]
  }
}

