package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.node.httpMod.ClientRequest
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/node-http-handler/build/write-request-body", JSImport.Namespace)
@js.native
object writeRequestBodyMod extends js.Object {
  def writeRequestBody(httpRequest: ClientRequest, request: HttpRequest[Readable]): Unit = js.native
}

