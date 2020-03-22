package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var url: String | js.Promise[String]
}

object AnonMethod {
  @scala.inline
  def apply(
    url: String | js.Promise[String],
    data: String = null,
    headers: js.Any = null,
    method: String = null,
    overrideMimeType: String = null,
    responseType: String = null
  ): AnonMethod = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

