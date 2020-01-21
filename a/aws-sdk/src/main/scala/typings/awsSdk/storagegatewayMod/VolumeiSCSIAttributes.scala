package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeiSCSIAttributes extends js.Object {
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * The logical disk number.
    */
  var LunNumber: js.UndefOr[PositiveIntObject] = js.native
  /**
    * The network interface identifier.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.storagegatewayMod.NetworkInterfaceId] = js.native
  /**
    * The port used to communicate with iSCSI targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object VolumeiSCSIAttributes {
  @scala.inline
  def apply(
    ChapEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    LunNumber: Int | Double = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    NetworkInterfacePort: Int | Double = null,
    TargetARN: TargetARN = null
  ): VolumeiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ChapEnabled)) __obj.updateDynamic("ChapEnabled")(ChapEnabled.asInstanceOf[js.Any])
    if (LunNumber != null) __obj.updateDynamic("LunNumber")(LunNumber.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (NetworkInterfacePort != null) __obj.updateDynamic("NetworkInterfacePort")(NetworkInterfacePort.asInstanceOf[js.Any])
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeiSCSIAttributes]
  }
}

