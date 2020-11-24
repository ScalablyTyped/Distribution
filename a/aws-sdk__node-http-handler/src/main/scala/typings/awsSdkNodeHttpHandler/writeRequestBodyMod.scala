package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.node.http2Mod.ClientHttp2Stream
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler/dist/cjs/write-request-body", JSImport.Namespace)
@js.native
object writeRequestBodyMod extends js.Object {
  
  def writeRequestBody(httpRequest: ClientHttp2Stream, request: HttpRequest): Unit = js.native
  def writeRequestBody(httpRequest: ClientRequest, request: HttpRequest): Unit = js.native
}
