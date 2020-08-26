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
  def apply(): VolumeiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeiSCSIAttributes]
  }
  @scala.inline
  implicit class VolumeiSCSIAttributesOps[Self <: VolumeiSCSIAttributes] (val x: Self) extends AnyVal {
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
    def setChapEnabled(value: scala.Boolean): Self = this.set("ChapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChapEnabled: Self = this.set("ChapEnabled", js.undefined)
    @scala.inline
    def setLunNumber(value: PositiveIntObject): Self = this.set("LunNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLunNumber: Self = this.set("LunNumber", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setNetworkInterfacePort(value: integer): Self = this.set("NetworkInterfacePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfacePort: Self = this.set("NetworkInterfacePort", js.undefined)
    @scala.inline
    def setTargetARN(value: TargetARN): Self = this.set("TargetARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetARN: Self = this.set("TargetARN", js.undefined)
  }
  
}

