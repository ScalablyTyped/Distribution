package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Hash[T] = org.scalablytyped.runtime.StringDictionary[T]

type MiddlewareHandler = js.Function3[
/* req */ typings.node.httpMod.IncomingMessage, 
/* res */ typings.node.httpMod.ServerResponse, 
/* next */ js.Function0[scala.Unit], 
js.Any]

type ProxyResponseMiddleware = js.Function3[
/* proxyRes */ typings.node.httpMod.ServerResponse | typings.node.httpMod.IncomingMessage, 
/* res */ typings.node.httpMod.ServerResponse, 
/* req */ typings.node.httpMod.IncomingMessage, 
scala.Unit]
