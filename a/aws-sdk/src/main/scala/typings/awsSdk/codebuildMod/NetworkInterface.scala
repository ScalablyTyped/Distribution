package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterface extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.undefined
}
object NetworkInterface {
  
  inline def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  extension [Self <: NetworkInterface](x: Self) {
    
    inline def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
