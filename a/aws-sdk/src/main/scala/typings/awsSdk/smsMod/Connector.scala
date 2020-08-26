package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /**
    * The time the connector was associated.
    */
  var associatedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The capabilities of the connector.
    */
  var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.native
  /**
    * The identifier of the connector.
    */
  var connectorId: js.UndefOr[ConnectorId] = js.native
  /**
    * The IP address of the connector.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The MAC address of the connector.
    */
  var macAddress: js.UndefOr[MacAddress] = js.native
  /**
    * The status of the connector.
    */
  var status: js.UndefOr[ConnectorStatus] = js.native
  /**
    * The connector version.
    */
  var version: js.UndefOr[ConnectorVersion] = js.native
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.native
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  /**
    * The VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
}

object Connector {
  @scala.inline
  def apply(): Connector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connector]
  }
  @scala.inline
  implicit class ConnectorOps[Self <: Connector] (val x: Self) extends AnyVal {
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
    def setAssociatedOn(value: Timestamp): Self = this.set("associatedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedOn: Self = this.set("associatedOn", js.undefined)
    @scala.inline
    def setCapabilityListVarargs(value: ConnectorCapability*): Self = this.set("capabilityList", js.Array(value :_*))
    @scala.inline
    def setCapabilityList(value: ConnectorCapabilityList): Self = this.set("capabilityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilityList: Self = this.set("capabilityList", js.undefined)
    @scala.inline
    def setConnectorId(value: ConnectorId): Self = this.set("connectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorId: Self = this.set("connectorId", js.undefined)
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setMacAddress(value: MacAddress): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
    @scala.inline
    def setStatus(value: ConnectorStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVersion(value: ConnectorVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVmManagerId(value: VmManagerId): Self = this.set("vmManagerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmManagerId: Self = this.set("vmManagerId", js.undefined)
    @scala.inline
    def setVmManagerName(value: VmManagerName): Self = this.set("vmManagerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmManagerName: Self = this.set("vmManagerName", js.undefined)
    @scala.inline
    def setVmManagerType(value: VmManagerType): Self = this.set("vmManagerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmManagerType: Self = this.set("vmManagerType", js.undefined)
  }
  
}

