package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeaders extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var url: String | js.Promise[String]
}

object Anon_DataHeaders {
  @scala.inline
  def apply(
    url: String | js.Promise[String],
    data: String = null,
    headers: js.Any = null,
    method: String = null,
    overrideMimeType: String = null,
    responseType: String = null
  ): Anon_DataHeaders = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[Anon_DataHeaders]
  }
}

