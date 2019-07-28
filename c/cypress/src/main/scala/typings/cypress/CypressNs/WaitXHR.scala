package typings.cypress.CypressNs

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
    val __obj = js.Dynamic.literal(duration = duration, id = id, method = method, request = request, requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders, response = response, responseBody = responseBody.asInstanceOf[js.Any], responseHeaders = responseHeaders, status = status, statusMessage = statusMessage, url = url, xhr = xhr)
  
    __obj.asInstanceOf[WaitXHR]
  }
}

