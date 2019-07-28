package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var contentType: String
  var data: js.Any
  var headers: js.Array[Header]
  var id: Double
  var redirectURL: String | Null
  var stage: String
  var status: Double
  var statusText: String
  var time: String
  var url: String
}

object HttpResponse {
  @scala.inline
  def apply(
    contentType: String,
    data: js.Any,
    headers: js.Array[Header],
    id: Double,
    stage: String,
    status: Double,
    statusText: String,
    time: String,
    url: String,
    redirectURL: String = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType, data = data, headers = headers, id = id, stage = stage, status = status, statusText = statusText, time = time, url = url)
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.asInstanceOf[HttpResponse]
  }
}

