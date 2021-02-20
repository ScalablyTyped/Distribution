package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [grpc](https://github.com/grpc/grpc-node) module.
  */
@js.native
trait grpc extends Grpc_ {
  
  /**
    * Configuration for gRPC clients.
    */
  var client: js.UndefOr[Grpc_] = js.native
  
  /**
    * Configuration for gRPC servers.
    */
  var server: js.UndefOr[Grpc_] = js.native
}
object grpc {
  
  @scala.inline
  def apply(): grpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[grpc]
  }
  
  @scala.inline
  implicit class grpcMutableBuilder[Self <: grpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Grpc_): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setServer(value: Grpc_): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
