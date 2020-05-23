package typings.blissfuljs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequestUpload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data
  extends /* propertyName */ StringDictionary[js.Any] {
  var data: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var onreadystatechange: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var readyState: js.UndefOr[Double] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var responseBody: js.UndefOr[js.Any] = js.undefined
  var responseText: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var responseXML: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var upload: js.UndefOr[XMLHttpRequestUpload] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: String = null,
    headers: StringDictionary[String] = null,
    method: String = null,
    onreadystatechange: /* ev */ ProgressEvent[EventTarget] => _ = null,
    readyState: js.UndefOr[Double] = js.undefined,
    response: js.Any = null,
    responseBody: js.Any = null,
    responseText: String = null,
    responseType: String = null,
    responseXML: js.Any = null,
    status: js.UndefOr[Double] = js.undefined,
    statusText: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    upload: XMLHttpRequestUpload = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Data = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(js.Any.fromFunction1(onreadystatechange))
    if (!js.isUndefined(readyState)) __obj.updateDynamic("readyState")(readyState.get.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody.asInstanceOf[js.Any])
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

