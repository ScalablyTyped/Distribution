package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [grpc](https://github.com/grpc/grpc-node) module.
  */
trait grpc
  extends StObject
     with Grpc_ {
  
  /**
    * Configuration for gRPC clients.
    */
  var client: js.UndefOr[Grpc_] = js.undefined
  
  /**
    * Configuration for gRPC servers.
    */
  var server: js.UndefOr[Grpc_] = js.undefined
}
object grpc {
  
  inline def apply(): grpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[grpc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: grpc] (val x: Self) extends AnyVal {
    
    inline def setClient(value: Grpc_): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setServer(value: Grpc_): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
