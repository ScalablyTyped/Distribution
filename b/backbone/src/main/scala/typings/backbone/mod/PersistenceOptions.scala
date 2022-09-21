package typings.backbone.mod

import typings.backbone.backboneBooleans.`false`
import typings.backbone.backboneBooleans.`true`
import typings.backbone.backboneStrings.`applicationSlashx-www-form-urlencoded`
import typings.backbone.backboneStrings.`multipartSlashform-data`
import typings.backbone.backboneStrings.html
import typings.backbone.backboneStrings.json
import typings.backbone.backboneStrings.jsonp
import typings.backbone.backboneStrings.script
import typings.backbone.backboneStrings.text
import typings.backbone.backboneStrings.textSlashplain
import typings.backbone.backboneStrings.xml
import typings.jquery.JQuery.Ajax.CompleteCallback
import typings.jquery.JQuery.Ajax.StatusCodeCallbacks
import typings.jquery.JQuery.Ajax.XHRFields
import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.jqXHR
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<backbone.backbone._Omit<jquery.JQueryAjaxSettings, 'success' | 'error'>> */
trait PersistenceOptions extends StObject {
  
  var accepts: js.UndefOr[PlainObject[String]] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var beforeSend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* jqXHR */ jqXHR[Any], /* settings */ this.type, `false` | Unit]
  ] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[TypeOrArray[CompleteCallback[Any]]] = js.undefined
  
  var contentType: js.UndefOr[String | `false`] = js.undefined
  
  var contents: js.UndefOr[PlainObject[js.RegExp]] = js.undefined
  
  var context: js.UndefOr[Any] = js.undefined
  
  var converters: js.UndefOr[PlainObject[(js.Function1[/* value */ Any, Any]) | `true`]] = js.undefined
  
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[PlainObject[Any] | String] = js.undefined
  
  var dataFilter: js.UndefOr[js.Function2[/* data */ String, /* type */ String, Any]] = js.undefined
  
  var dataType: js.UndefOr[xml | html | script | json | jsonp | text | String] = js.undefined
  
  var emulateHTTP: js.UndefOr[Boolean] = js.undefined
  
  var emulateJSON: js.UndefOr[Boolean] = js.undefined
  
  var enctype: js.UndefOr[
    `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain
  ] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[/* modelOrCollection */ Any, /* response */ Any, /* options */ Any, Unit]
  ] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[PlainObject[js.UndefOr[String | Null]]] = js.undefined
  
  var ifModified: js.UndefOr[Boolean] = js.undefined
  
  var isLocal: js.UndefOr[Boolean] = js.undefined
  
  var jsonp: js.UndefOr[String | `false`] = js.undefined
  
  var jsonpCallback: js.UndefOr[String | (js.ThisFunction0[/* this */ Any, String])] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var processData: js.UndefOr[Boolean] = js.undefined
  
  var scriptCharset: js.UndefOr[String] = js.undefined
  
  var statusCode: js.UndefOr[StatusCodeCallbacks[Any]] = js.undefined
  
  // TODO: Generalize modelOrCollection
  var success: js.UndefOr[
    js.Function3[/* modelOrCollection */ Any, /* response */ Any, /* options */ Any, Unit]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var traditional: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var xhr: js.UndefOr[js.Function0[XMLHttpRequest]] = js.undefined
  
  var xhrFields: js.UndefOr[XHRFields] = js.undefined
}
object PersistenceOptions {
  
  inline def apply(): PersistenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceOptions]
  }
  
  extension [Self <: PersistenceOptions](x: Self) {
    
    inline def setAccepts(value: PlainObject[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
    
    inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBeforeSend(
      value: js.ThisFunction2[/* this */ Any, /* jqXHR */ jqXHR[Any], PersistenceOptions, `false` | Unit]
    ): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setComplete(value: TypeOrArray[CompleteCallback[Any]]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCompleteVarargs(value: CompleteCallback[Any]*): Self = StObject.set(x, "complete", js.Array(value*))
    
    inline def setContentType(value: String | `false`): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContents(value: PlainObject[js.RegExp]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setConverters(value: PlainObject[(js.Function1[/* value */ Any, Any]) | `true`]): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
    
    inline def setConvertersUndefined: Self = StObject.set(x, "converters", js.undefined)
    
    inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
    
    inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
    
    inline def setData(value: PlainObject[Any] | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFilter(value: (/* data */ String, /* type */ String) => Any): Self = StObject.set(x, "dataFilter", js.Any.fromFunction2(value))
    
    inline def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
    
    inline def setDataType(value: xml | html | script | json | jsonp | text | String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEmulateHTTP(value: Boolean): Self = StObject.set(x, "emulateHTTP", value.asInstanceOf[js.Any])
    
    inline def setEmulateHTTPUndefined: Self = StObject.set(x, "emulateHTTP", js.undefined)
    
    inline def setEmulateJSON(value: Boolean): Self = StObject.set(x, "emulateJSON", value.asInstanceOf[js.Any])
    
    inline def setEmulateJSONUndefined: Self = StObject.set(x, "emulateJSON", js.undefined)
    
    inline def setEnctype(value: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
    
    inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
    
    inline def setError(value: (/* modelOrCollection */ Any, /* response */ Any, /* options */ Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setHeaders(value: PlainObject[js.UndefOr[String | Null]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIfModified(value: Boolean): Self = StObject.set(x, "ifModified", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedUndefined: Self = StObject.set(x, "ifModified", js.undefined)
    
    inline def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    inline def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    inline def setJsonp(value: String | `false`): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallback(value: String | (js.ThisFunction0[/* this */ Any, String])): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
    
    inline def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
    
    inline def setScriptCharset(value: String): Self = StObject.set(x, "scriptCharset", value.asInstanceOf[js.Any])
    
    inline def setScriptCharsetUndefined: Self = StObject.set(x, "scriptCharset", js.undefined)
    
    inline def setStatusCode(value: StatusCodeCallbacks[Any]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setSuccess(value: (/* modelOrCollection */ Any, /* response */ Any, /* options */ Any) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTraditional(value: Boolean): Self = StObject.set(x, "traditional", value.asInstanceOf[js.Any])
    
    inline def setTraditionalUndefined: Self = StObject.set(x, "traditional", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setXhr(value: () => XMLHttpRequest): Self = StObject.set(x, "xhr", js.Any.fromFunction0(value))
    
    inline def setXhrFields(value: XHRFields): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    inline def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
