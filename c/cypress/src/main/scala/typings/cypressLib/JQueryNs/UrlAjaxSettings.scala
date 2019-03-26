package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlAjaxSettings[TContext]
  extends cypressLib.JQueryNs.AjaxNs.AjaxSettingsBase[TContext] {
  /**
    * A pre-request callback function that can be used to modify the jqXHR (in jQuery 1.4.x,
    * XMLHTTPRequest) object before it is sent. Use this to set custom headers, etc. The jqXHR and
    * settings objects are passed as arguments. This is an Ajax Event. Returning false in the beforeSend
    * function will cancel the request. As of jQuery 1.5, the beforeSend option will be called regardless
    * of the type of request.
    */
  @JSName("beforeSend")
  var beforeSend_UrlAjaxSettings: js.UndefOr[
    js.ThisFunction2[
      /* this */ TContext, 
      /* jqXHR */ jqXHR[_], 
      /* settings */ UrlAjaxSettings[TContext], 
      cypressLib.cypressLibNumbers.`false` | scala.Unit
    ]
  ] = js.undefined
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: java.lang.String
}

object UrlAjaxSettings {
  @scala.inline
  def apply[TContext](
    url: java.lang.String,
    accepts: PlainObject[java.lang.String] = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      /* this */ TContext, 
      /* jqXHR */ jqXHR[_], 
      /* settings */ UrlAjaxSettings[TContext], 
      cypressLib.cypressLibNumbers.`false` | scala.Unit
    ] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    complete: TypeOrArray[cypressLib.JQueryNs.AjaxNs.CompleteCallback[TContext]] = null,
    contentType: java.lang.String | cypressLib.cypressLibNumbers.`false` = null,
    contents: PlainObject[stdLib.RegExp] = null,
    context: TContext = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | cypressLib.cypressLibNumbers.`true`] = null,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    data: PlainObject[_] | java.lang.String = null,
    dataFilter: (/* data */ java.lang.String, /* type */ java.lang.String) => _ = null,
    dataType: cypressLib.cypressLibStrings.xml | cypressLib.cypressLibStrings.html | cypressLib.cypressLibStrings.script | cypressLib.cypressLibStrings.json | cypressLib.cypressLibStrings.jsonp | cypressLib.cypressLibStrings.text | java.lang.String = null,
    error: TypeOrArray[cypressLib.JQueryNs.AjaxNs.ErrorCallback[TContext]] = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[java.lang.String | scala.Null]] = null,
    ifModified: js.UndefOr[scala.Boolean] = js.undefined,
    isLocal: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: java.lang.String | cypressLib.cypressLibNumbers.`false` = null,
    jsonpCallback: java.lang.String | (js.ThisFunction0[TContext, java.lang.String]) = null,
    method: java.lang.String = null,
    mimeType: java.lang.String = null,
    password: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    scriptCharset: java.lang.String = null,
    statusCode: cypressLib.JQueryNs.AjaxNs.StatusCodeCallbacks[TContext] = null,
    success: TypeOrArray[cypressLib.JQueryNs.AjaxNs.SuccessCallback[TContext]] = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    username: java.lang.String = null,
    xhr: () => stdLib.XMLHttpRequest = null,
    xhrFields: cypressLib.JQueryNs.AjaxNs.XHRFields = null
  ): UrlAjaxSettings[TContext] = {
    val __obj = js.Dynamic.literal(url = url)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[UrlAjaxSettings[TContext]]
  }
}

