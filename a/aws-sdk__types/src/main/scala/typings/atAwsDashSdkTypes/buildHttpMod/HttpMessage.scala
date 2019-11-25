package typings.atAwsDashSdkTypes.buildHttpMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMessage[StreamType] extends js.Object {
  var body: js.UndefOr[ArrayBuffer | ArrayBufferView | String | StreamType] = js.undefined
  var headers: HeaderBag
}

object HttpMessage {
  @scala.inline
  def apply[StreamType](headers: HeaderBag, body: ArrayBuffer | ArrayBufferView | String | StreamType = null): HttpMessage[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMessage[StreamType]]
  }
}

