package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitXHR extends js.Object {
  var duration: scala.Double
  var id: java.lang.String
  var method: HttpMethod
  var request: cypressLib.Anon_Body
  var requestBody: java.lang.String | ObjectLike
  var requestHeaders: ObjectLike
  var response: cypressLib.Anon_Body
  var responseBody: java.lang.String | ObjectLike
  var responseHeaders: ObjectLike
  var status: scala.Double
  var statusMessage: java.lang.String
  var url: java.lang.String
  var xhr: stdLib.XMLHttpRequest
}

object WaitXHR {
  @scala.inline
  def apply(
    duration: scala.Double,
    id: java.lang.String,
    method: HttpMethod,
    request: cypressLib.Anon_Body,
    requestBody: java.lang.String | ObjectLike,
    requestHeaders: ObjectLike,
    response: cypressLib.Anon_Body,
    responseBody: java.lang.String | ObjectLike,
    responseHeaders: ObjectLike,
    status: scala.Double,
    statusMessage: java.lang.String,
    url: java.lang.String,
    xhr: stdLib.XMLHttpRequest
  ): WaitXHR = {
    val __obj = js.Dynamic.literal(duration = duration, id = id, method = method, request = request, requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders, response = response, responseBody = responseBody.asInstanceOf[js.Any], responseHeaders = responseHeaders, status = status, statusMessage = statusMessage, url = url, xhr = xhr)
  
    __obj.asInstanceOf[WaitXHR]
  }
}

