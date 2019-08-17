package typings.atAwsDashSdkTypes.buildHttpMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse[StreamType] extends HttpMessage[StreamType] {
  var statusCode: Double
}

object HttpResponse {
  @scala.inline
  def apply[StreamType](
    headers: HeaderBag,
    statusCode: Double,
    body: ArrayBuffer | ArrayBufferView | String | StreamType = null
  ): HttpResponse[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers, statusCode = statusCode)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse[StreamType]]
  }
}

