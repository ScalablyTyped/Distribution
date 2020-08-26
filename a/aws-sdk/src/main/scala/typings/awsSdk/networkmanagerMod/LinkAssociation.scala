package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAssociation extends js.Object {
  /**
    * The device ID for the link association.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var LinkAssociationState: js.UndefOr[typings.awsSdk.networkmanagerMod.LinkAssociationState] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
}

object LinkAssociation {
  @scala.inline
  def apply(): LinkAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAssociation]
  }
  @scala.inline
  implicit class LinkAssociationOps[Self <: LinkAssociation] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("DeviceId", js.undefined)
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    @scala.inline
    def setLinkAssociationState(value: LinkAssociationState): Self = this.set("LinkAssociationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkAssociationState: Self = this.set("LinkAssociationState", js.undefined)
    @scala.inline
    def setLinkId(value: String): Self = this.set("LinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkId: Self = this.set("LinkId", js.undefined)
  }
  
}

