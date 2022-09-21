package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpoint extends StObject {
  
  /**
    * One or more network interfaces of the endpoint. Also known as an interface endpoint. 
    */
  var NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
  
  /**
    * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC identifier that the endpoint is associated. 
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object VpcEndpoint {
  
  inline def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  
  extension [Self <: VpcEndpoint](x: Self) {
    
    inline def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
