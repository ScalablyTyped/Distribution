package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.distTypesHttpMod.HeaderBag
import typings.node.http2Mod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetTransformedHeadersMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/get-transformed-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTransformedHeaders(headers: IncomingHttpHeaders): HeaderBag = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformedHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[HeaderBag]
}
