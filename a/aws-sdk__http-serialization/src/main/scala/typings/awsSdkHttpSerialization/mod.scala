package typings.awsSdkHttpSerialization

import typings.awsSdkTypes.httpMod.HttpMessage
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.httpMod.HttpResponse
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/http-serialization", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parseRequest(serialized: String): DerivedHttpRequest = js.native
  def parseResponse(serialized: String): HttpResponse[String] = js.native
  def serializeRequest(request: HttpRequest[_]): String = js.native
  def serializeResponse(response: HttpResponse[_]): String = js.native
  type DerivedHttpRequest = Partial[HttpRequest[String]] with HttpMessage[String] with AnonMethod
}

