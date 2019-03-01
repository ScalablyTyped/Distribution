package typings
package blissfuljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var onreadystatechange: js.UndefOr[js.Function1[/* ev */ stdLib.ProgressEvent, _]] = js.undefined
  var readyState: js.UndefOr[scala.Double] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var responseBody: js.UndefOr[js.Any] = js.undefined
  var responseText: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var responseXML: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var upload: js.UndefOr[stdLib.XMLHttpRequestUpload] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    data: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null,
    onreadystatechange: js.Function1[/* ev */ stdLib.ProgressEvent, _] = null,
    readyState: scala.Int | scala.Double = null,
    response: js.Any = null,
    responseBody: js.Any = null,
    responseText: java.lang.String = null,
    responseType: java.lang.String = null,
    responseXML: js.Any = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    upload: stdLib.XMLHttpRequestUpload = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange)
    if (readyState != null) __obj.updateDynamic("readyState")(readyState.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Anon_Data]
  }
}

