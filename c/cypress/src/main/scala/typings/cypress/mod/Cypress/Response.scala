package typings.cypress.mod.Cypress

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var allRequestResponses: js.Array[_]
  var body: js.Any
  var duration: Double
  var headers: StringDictionary[String]
  var isOkStatusCode: Boolean
  var redirectedToUrl: String
  var requestHeaders: StringDictionary[String]
  var status: Double
  var statusText: String
}

object Response {
  @scala.inline
  def apply(
    allRequestResponses: js.Array[_],
    body: js.Any,
    duration: Double,
    headers: StringDictionary[String],
    isOkStatusCode: Boolean,
    redirectedToUrl: String,
    requestHeaders: StringDictionary[String],
    status: Double,
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(allRequestResponses = allRequestResponses.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isOkStatusCode = isOkStatusCode.asInstanceOf[js.Any], redirectedToUrl = redirectedToUrl.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

