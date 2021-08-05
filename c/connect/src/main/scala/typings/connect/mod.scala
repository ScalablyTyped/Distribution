package typings.connect

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new connect server.
    * @public
    */
  inline def apply(): Server = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Server]
  
  @JSImport("connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("connect", "IncomingMessage")
  @js.native
  class IncomingMessage protected ()
    extends typings.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
    
    var originalUrl: js.UndefOr[String] = js.native
  }
  
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ NextFunction, 
    Unit
  ]
  
  type HandleFunction = SimpleHandleFunction | NextHandleFunction | ErrorHandleFunction
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  
  type NextHandleFunction = js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction, Unit]
  
  @js.native
  trait Server
    extends StObject
       with EventEmitter {
    
    def apply(req: typings.node.httpMod.IncomingMessage, res: ServerResponse): Unit = js.native
    def apply(req: typings.node.httpMod.IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    
    /**
      * Handle server requests, punting them down
      * the middleware stack.
      *
      * @private
      */
    def handle(req: typings.node.httpMod.IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    
    def listen(handle: js.Any): typings.node.httpMod.Server = js.native
    def listen(handle: js.Any, listeningListener: js.Function): typings.node.httpMod.Server = js.native
    def listen(path: String): typings.node.httpMod.Server = js.native
    def listen(path: String, callback: js.Function): typings.node.httpMod.Server = js.native
    /**
      * Listen for connections.
      *
      * This method takes the same arguments
      * as node's `http.Server#listen()`.
      *
      * HTTP and HTTPS:
      *
      * If you run your application both as HTTP
      * and HTTPS you may wrap them individually,
      * since your Connect "server" is really just
      * a JavaScript `Function`.
      *
      *      var connect = require('connect')
      *        , http = require('http')
      *        , https = require('https');
      *
      *      var app = connect();
      *
      *      http.createServer(app).listen(80);
      *      https.createServer(options, app).listen(443);
      *
      * @api public
      */
    def listen(port: Double): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, backlog: Double): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, backlog: Unit, callback: js.Function): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, callback: js.Function): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Double): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Double, callback: js.Function): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Unit, callback: js.Function): typings.node.httpMod.Server = js.native
    def listen(port: Double, hostname: Unit, callback: js.Function): typings.node.httpMod.Server = js.native
    
    var route: String = js.native
    
    var stack: js.Array[ServerStackItem] = js.native
    
    /**
      * Utilize the given middleware `handle` to the given `route`,
      * defaulting to _/_. This "route" is the mount-point for the
      * middleware, when given a value other than _/_ the middleware
      * is only effective when that segment is present in the request's
      * pathname.
      *
      * For example if we were to mount a function at _/admin_, it would
      * be invoked on _/admin_, and _/admin/settings_, however it would
      * not be invoked for _/_, or _/posts_.
      *
      * @public
      */
    def use(fn: HandleFunction): Server = js.native
    def use(route: String, fn: HandleFunction): Server = js.native
  }
  
  type ServerHandle = HandleFunction | typings.node.httpMod.Server
  
  trait ServerStackItem extends StObject {
    
    var handle: ServerHandle
    
    var route: String
  }
  object ServerStackItem {
    
    inline def apply(handle: ServerHandle, route: String): ServerStackItem = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStackItem]
    }
    
    extension [Self <: ServerStackItem](x: Self) {
      
      inline def setHandle(value: ServerHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleFunction2(value: (/* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setHandleFunction3(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction3(value))
      
      inline def setHandleFunction4(
        value: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit
      ): Self = StObject.set(x, "handle", js.Any.fromFunction4(value))
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleHandleFunction = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
}
