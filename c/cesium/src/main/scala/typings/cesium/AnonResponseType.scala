package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponseType extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
}

object AnonResponseType {
  @scala.inline
  def apply(
    data: js.Any = null,
    headers: js.Any = null,
    overrideMimeType: String = null,
    responseType: String = null
  ): AnonResponseType = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponseType]
  }
}

