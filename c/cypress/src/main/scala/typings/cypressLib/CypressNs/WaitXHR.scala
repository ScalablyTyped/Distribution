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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("responseBody")(responseBody.asInstanceOf[js.Any])
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[WaitXHR]
  }
}

