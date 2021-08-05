package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connector extends StObject {
  
  /**
    * The time the connector was associated.
    */
  var associatedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The capabilities of the connector.
    */
  var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined
  
  /**
    * The ID of the connector.
    */
  var connectorId: js.UndefOr[ConnectorId] = js.undefined
  
  /**
    * The IP address of the connector.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The MAC address of the connector.
    */
  var macAddress: js.UndefOr[MacAddress] = js.undefined
  
  /**
    * The status of the connector.
    */
  var status: js.UndefOr[ConnectorStatus] = js.undefined
  
  /**
    * The connector version.
    */
  var version: js.UndefOr[ConnectorVersion] = js.undefined
  
  /**
    * The ID of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
  
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
  
  /**
    * The VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
}
object Connector {
  
  inline def apply(): Connector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connector]
  }
  
  extension [Self <: Connector](x: Self) {
    
    inline def setAssociatedOn(value: Timestamp): Self = StObject.set(x, "associatedOn", value.asInstanceOf[js.Any])
    
    inline def setAssociatedOnUndefined: Self = StObject.set(x, "associatedOn", js.undefined)
    
    inline def setCapabilityList(value: ConnectorCapabilityList): Self = StObject.set(x, "capabilityList", value.asInstanceOf[js.Any])
    
    inline def setCapabilityListUndefined: Self = StObject.set(x, "capabilityList", js.undefined)
    
    inline def setCapabilityListVarargs(value: ConnectorCapability*): Self = StObject.set(x, "capabilityList", js.Array(value :_*))
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "connectorId", value.asInstanceOf[js.Any])
    
    inline def setConnectorIdUndefined: Self = StObject.set(x, "connectorId", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setMacAddress(value: MacAddress): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    inline def setStatus(value: ConnectorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersion(value: ConnectorVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVmManagerId(value: VmManagerId): Self = StObject.set(x, "vmManagerId", value.asInstanceOf[js.Any])
    
    inline def setVmManagerIdUndefined: Self = StObject.set(x, "vmManagerId", js.undefined)
    
    inline def setVmManagerName(value: VmManagerName): Self = StObject.set(x, "vmManagerName", value.asInstanceOf[js.Any])
    
    inline def setVmManagerNameUndefined: Self = StObject.set(x, "vmManagerName", js.undefined)
    
    inline def setVmManagerType(value: VmManagerType): Self = StObject.set(x, "vmManagerType", value.asInstanceOf[js.Any])
    
    inline def setVmManagerTypeUndefined: Self = StObject.set(x, "vmManagerType", js.undefined)
  }
}
