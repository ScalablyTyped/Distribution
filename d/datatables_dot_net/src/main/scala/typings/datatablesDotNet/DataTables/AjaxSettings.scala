package typings.datatablesDotNet.DataTables

import typings.jquery.JQuery.Ajax.CompleteCallback
import typings.jquery.JQuery.Ajax.ErrorCallback
import typings.jquery.JQuery.Ajax.StatusCodeCallbacks
import typings.jquery.JQuery.Ajax.SuccessCallback
import typings.jquery.JQuery.Ajax.XHRFields
import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.jqXHR
import typings.jquery.jqueryNumbers.`false`
import typings.jquery.jqueryNumbers.`true`
import typings.jquery.jqueryStrings.html
import typings.jquery.jqueryStrings.json
import typings.jquery.jqueryStrings.jsonp
import typings.jquery.jqueryStrings.script
import typings.jquery.jqueryStrings.text
import typings.jquery.jqueryStrings.xml
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings
  extends typings.jquery.JQuery.AjaxSettings[js.Any] {
  /**
    * Data property or manipulation method for table data. Since: 1.10
    */
  var dataSrc: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Array[_]])] = js.undefined
  /**
    * Add or modify data submitted to the server upon an Ajax request. Since: 1.10
    */
  @JSName("data")
  var data_AjaxSettings: js.UndefOr[js.Object | FunctionAjaxData] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], AjaxSettings, `false` | Unit] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    complete: TypeOrArray[CompleteCallback[js.Any]] = null,
    contentType: String | `false` = null,
    contents: PlainObject[RegExp] = null,
    context: js.Any = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: js.Object | FunctionAjaxData = null,
    dataFilter: (/* data */ String, /* type */ String) => _ = null,
    dataSrc: String | (js.Function1[/* data */ js.Any, js.Array[_]]) = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (context != null) __obj.updateDynamic("context")(context)
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataSrc != null) __obj.updateDynamic("dataSrc")(dataSrc.asInstanceOf[js.Any])
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
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[AjaxSettings]
  }
}

