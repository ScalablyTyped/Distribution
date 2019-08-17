package typings.atAwsDashSdkTypes.buildHttpMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedHttpResponse extends HttpResponse[Uint8Array] {
  @JSName("body")
  var body_ResolvedHttpResponse: String
}

object ResolvedHttpResponse {
  @scala.inline
  def apply(body: String, headers: HeaderBag, statusCode: Double): ResolvedHttpResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[ResolvedHttpResponse]
  }
}

