package typings.awsSdkNodeHttpHandler

import typings.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetSocketKeepAliveMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/set-socket-keep-alive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSocketKeepAlive(request: ClientRequest, param1: SocketKeepAliveOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSocketKeepAlive")(request.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait SocketKeepAliveOptions extends StObject {
    
    var keepAlive: Boolean
    
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  }
  object SocketKeepAliveOptions {
    
    inline def apply(keepAlive: Boolean): SocketKeepAliveOptions = {
      val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketKeepAliveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketKeepAliveOptions] (val x: Self) extends AnyVal {
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
    }
  }
}
