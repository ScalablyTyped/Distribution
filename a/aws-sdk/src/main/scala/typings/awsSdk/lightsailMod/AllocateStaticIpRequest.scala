package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP address.
    */
  var staticIpName: ResourceName
}
object AllocateStaticIpRequest {
  
  inline def apply(staticIpName: ResourceName): AllocateStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateStaticIpRequest]
  }
  
  extension [Self <: AllocateStaticIpRequest](x: Self) {
    
    inline def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
