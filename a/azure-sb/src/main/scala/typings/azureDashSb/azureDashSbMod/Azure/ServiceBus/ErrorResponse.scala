package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import typings.azureDashSb.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends Response {
  @JSName("body")
  var body_ErrorResponse: Anon_Error
}

object ErrorResponse {
  @scala.inline
  def apply(
    body: Anon_Error,
    headers: Dictionary[String],
    isSuccessful: Boolean,
    statusCode: Double,
    md5: String = null
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, isSuccessful = isSuccessful, statusCode = statusCode)
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    __obj.asInstanceOf[ErrorResponse]
  }
}

