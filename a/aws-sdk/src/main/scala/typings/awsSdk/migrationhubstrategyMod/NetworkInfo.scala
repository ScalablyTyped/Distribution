package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInfo extends StObject {
  
  /**
    *  Information about the name of the interface of the server for which the assessment was run. 
    */
  var interfaceName: InterfaceName
  
  /**
    *  Information about the IP address of the server for which the assessment was run. 
    */
  var ipAddress: IPAddress
  
  /**
    *  Information about the MAC address of the server for which the assessment was run. 
    */
  var macAddress: MacAddress
  
  /**
    *  Information about the subnet mask of the server for which the assessment was run. 
    */
  var netMask: NetMask
}
object NetworkInfo {
  
  inline def apply(interfaceName: InterfaceName, ipAddress: IPAddress, macAddress: MacAddress, netMask: NetMask): NetworkInfo = {
    val __obj = js.Dynamic.literal(interfaceName = interfaceName.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], netMask = netMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  
  extension [Self <: NetworkInfo](x: Self) {
    
    inline def setInterfaceName(value: InterfaceName): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: IPAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddress(value: MacAddress): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setNetMask(value: NetMask): Self = StObject.set(x, "netMask", value.asInstanceOf[js.Any])
  }
}
