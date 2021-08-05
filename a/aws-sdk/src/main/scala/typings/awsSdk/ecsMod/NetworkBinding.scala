package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkBinding extends StObject {
  
  /**
    * The IP address that the container is bound to on the container instance.
    */
  var bindIP: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on the container that is used with the network binding.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The port number on the host that is used with the network binding.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The protocol used for the network binding.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.undefined
}
object NetworkBinding {
  
  inline def apply(): NetworkBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBinding]
  }
  
  extension [Self <: NetworkBinding](x: Self) {
    
    inline def setBindIP(value: String): Self = StObject.set(x, "bindIP", value.asInstanceOf[js.Any])
    
    inline def setBindIPUndefined: Self = StObject.set(x, "bindIP", js.undefined)
    
    inline def setContainerPort(value: BoxedInteger): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setHostPort(value: BoxedInteger): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setProtocol(value: TransportProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
