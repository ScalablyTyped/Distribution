package typings.defaultGateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("default-gateway", "v4")
  @js.native
  val v4: DefaultGatewayFn = js.native
  
  @JSImport("default-gateway", "v6")
  @js.native
  val v6: DefaultGatewayFn = js.native
  
  @js.native
  trait DefaultGatewayFn extends StObject {
    
    def apply(): js.Promise[Gateway] = js.native
    
    def sync(): Gateway = js.native
  }
  
  trait Gateway extends StObject {
    
    var gateway: String
    
    var interface: String
  }
  object Gateway {
    
    inline def apply(gateway: String, interface: String): Gateway = {
      val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gateway]
    }
    
    extension [Self <: Gateway](x: Self) {
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    }
  }
}
