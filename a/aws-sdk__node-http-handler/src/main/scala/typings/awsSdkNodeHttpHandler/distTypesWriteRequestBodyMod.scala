package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import typings.node.http2Mod.ClientHttp2Stream
import typings.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWriteRequestBodyMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/write-request-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeRequestBody(httpRequest: ClientHttp2Stream, request: HttpRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeRequestBody")(httpRequest.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeRequestBody(httpRequest: ClientRequest, request: HttpRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeRequestBody")(httpRequest.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
