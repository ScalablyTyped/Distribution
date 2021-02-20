package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connector extends StObject {
  
  /**
    * The time the connector was associated.
    */
  var associatedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * The capabilities of the connector.
    */
  var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.native
  
  /**
    * The ID of the connector.
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
    * The ID of the VM manager.
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
  implicit class ConnectorMutableBuilder[Self <: Connector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedOn(value: Timestamp): Self = StObject.set(x, "associatedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedOnUndefined: Self = StObject.set(x, "associatedOn", js.undefined)
    
    @scala.inline
    def setCapabilityList(value: ConnectorCapabilityList): Self = StObject.set(x, "capabilityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityListUndefined: Self = StObject.set(x, "capabilityList", js.undefined)
    
    @scala.inline
    def setCapabilityListVarargs(value: ConnectorCapability*): Self = StObject.set(x, "capabilityList", js.Array(value :_*))
    
    @scala.inline
    def setConnectorId(value: ConnectorId): Self = StObject.set(x, "connectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorIdUndefined: Self = StObject.set(x, "connectorId", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setMacAddress(value: MacAddress): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    @scala.inline
    def setStatus(value: ConnectorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: ConnectorVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVmManagerId(value: VmManagerId): Self = StObject.set(x, "vmManagerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmManagerIdUndefined: Self = StObject.set(x, "vmManagerId", js.undefined)
    
    @scala.inline
    def setVmManagerName(value: VmManagerName): Self = StObject.set(x, "vmManagerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmManagerNameUndefined: Self = StObject.set(x, "vmManagerName", js.undefined)
    
    @scala.inline
    def setVmManagerType(value: VmManagerType): Self = StObject.set(x, "vmManagerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmManagerTypeUndefined: Self = StObject.set(x, "vmManagerType", js.undefined)
  }
}
