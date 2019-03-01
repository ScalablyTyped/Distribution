package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var allRequestResponses: js.Array[_]
  var body: js.Any
  var duration: scala.Double
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var isOkStatusCode: scala.Boolean
  var redirectedToUrl: java.lang.String
  var requestHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var status: scala.Double
  var statusText: java.lang.String
}

object Response {
  @scala.inline
  def apply(
    allRequestResponses: js.Array[_],
    body: js.Any,
    duration: scala.Double,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    isOkStatusCode: scala.Boolean,
    redirectedToUrl: java.lang.String,
    requestHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    status: scala.Double,
    statusText: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allRequestResponses")(allRequestResponses)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("isOkStatusCode")(isOkStatusCode)
    __obj.updateDynamic("redirectedToUrl")(redirectedToUrl)
    __obj.updateDynamic("requestHeaders")(requestHeaders)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Response]
  }
}

