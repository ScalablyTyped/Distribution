package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.httpMod.HeaderBag
import typings.node.http2Mod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTransformedHeadersMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/get-transformed-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTransformedHeaders(headers: IncomingHttpHeaders): HeaderBag = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformedHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[HeaderBag]
}
