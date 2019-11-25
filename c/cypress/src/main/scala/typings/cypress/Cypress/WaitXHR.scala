package typings.cypress.Cypress

import typings.cypress.Anon_Body
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitXHR extends js.Object {
  var duration: Double
  var id: String
  var method: HttpMethod
  var request: Anon_Body
  var requestBody: String | ObjectLike
  var requestHeaders: ObjectLike
  var response: Anon_Body
  var responseBody: String | ObjectLike
  var responseHeaders: ObjectLike
  var status: Double
  var statusMessage: String
  var url: String
  var xhr: XMLHttpRequest
}

object WaitXHR {
  @scala.inline
  def apply(
    duration: Double,
    id: String,
    method: HttpMethod,
    request: Anon_Body,
    requestBody: String | ObjectLike,
    requestHeaders: ObjectLike,
    response: Anon_Body,
    responseBody: String | ObjectLike,
    responseHeaders: ObjectLike,
    status: Double,
    statusMessage: String,
    url: String,
    xhr: XMLHttpRequest
  ): WaitXHR = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseBody = responseBody.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitXHR]
  }
}

