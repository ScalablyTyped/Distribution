package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: Dictionary[String | js.Object]
  var headers: Dictionary[String]
  var isSuccessful: Boolean
  var md5: js.UndefOr[String] = js.undefined
  var statusCode: Double
}

object Response {
  @scala.inline
  def apply(
    body: Dictionary[String | js.Object],
    headers: Dictionary[String],
    isSuccessful: Boolean,
    statusCode: Double,
    md5: String = null
  ): Response = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, isSuccessful = isSuccessful, statusCode = statusCode)
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    __obj.asInstanceOf[Response]
  }
}

