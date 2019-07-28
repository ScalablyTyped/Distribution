package typings.cypress.JQueryNs

import typings.cypress.JQueryNs.AjaxNs.AjaxSettingsBase
import typings.cypress.JQueryNs.AjaxNs.CompleteCallback
import typings.cypress.JQueryNs.AjaxNs.ErrorCallback
import typings.cypress.JQueryNs.AjaxNs.StatusCodeCallbacks
import typings.cypress.JQueryNs.AjaxNs.SuccessCallback
import typings.cypress.JQueryNs.AjaxNs.XHRFields
import typings.cypress.cypressNumbers.`false`
import typings.cypress.cypressNumbers.`true`
import typings.cypress.cypressStrings.html
import typings.cypress.cypressStrings.json
import typings.cypress.cypressStrings.jsonp
import typings.cypress.cypressStrings.script
import typings.cypress.cypressStrings.text
import typings.cypress.cypressStrings.xml
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlAjaxSettings[TContext] extends AjaxSettingsBase[TContext] {
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
      `false` | Unit
    ]
  ] = js.undefined
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: String
}

object UrlAjaxSettings {
  @scala.inline
  def apply[TContext](
    url: String,
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      /* this */ TContext, 
      /* jqXHR */ jqXHR[_], 
      /* settings */ UrlAjaxSettings[TContext], 
      `false` | Unit
    ] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    complete: TypeOrArray[CompleteCallback[TContext]] = null,
    contentType: String | `false` = null,
    contents: PlainObject[RegExp] = null,
    context: TContext = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => _ = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    error: TypeOrArray[ErrorCallback[TContext]] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[TContext, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    statusCode: StatusCodeCallbacks[TContext] = null,
    success: TypeOrArray[SuccessCallback[TContext]] = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
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

