package typings.cyberblastWebserver

import org.scalablytyped.runtime.StringDictionary
import typings.cyberblastLogger.mod.Logger
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cyberblast/webserver", "WebServer")
  @js.native
  open class WebServer () extends StObject {
    def this(webConfigFile: String) = this()
    def this(webConfigFile: String, logConfigFile: String) = this()
    def this(webConfigFile: Unit, logConfigFile: String) = this()
    
    def respondError(error: String, context: ServerContext): js.Promise[Unit] = js.native
    def respondError(error: String, context: ServerContext, code: Double): js.Promise[Unit] = js.native
    def respondError(error: String, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
    def respondError(error: String, context: ServerContext, code: Unit, message: String): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext, code: Double): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
    def respondError(error: js.Error, context: ServerContext, code: Unit, message: String): js.Promise[Unit] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
  }
  
  trait ServerContext extends StObject {
    
    var client: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[String | Buffer] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var request: IncomingMessage
    
    var response: ServerResponse[IncomingMessage]
    
    var route: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var server: WebServer
  }
  object ServerContext {
    
    inline def apply(request: IncomingMessage, response: ServerResponse[IncomingMessage], server: WebServer): ServerContext = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerContext] (val x: Self) extends AnyVal {
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: StringDictionary[Any]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setServer(value: WebServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
