package typings.azureSb.mod.Azure.ServiceBus

import typings.azureSb.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends Response {
  @JSName("body")
  var body_ErrorResponse: Error
}

object ErrorResponse {
  @scala.inline
  def apply(
    body: Error,
    headers: Dictionary[String],
    isSuccessful: Boolean,
    statusCode: Double,
    md5: String = null
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

