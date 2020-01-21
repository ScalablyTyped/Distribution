package typings.casperjs.mod

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
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

