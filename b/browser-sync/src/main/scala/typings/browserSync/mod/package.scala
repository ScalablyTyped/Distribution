package typings.browserSync.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Hash[T] = StringDictionary[T]

type MiddlewareHandler = js.Function3[
/* req */ IncomingMessage, 
/* res */ ServerResponse[IncomingMessage], 
/* next */ js.Function0[Unit], 
Any]

type ProxyResponseMiddleware = js.Function3[
/* proxyRes */ ServerResponse[IncomingMessage] | IncomingMessage, 
/* res */ ServerResponse[IncomingMessage], 
/* req */ IncomingMessage, 
Unit]
