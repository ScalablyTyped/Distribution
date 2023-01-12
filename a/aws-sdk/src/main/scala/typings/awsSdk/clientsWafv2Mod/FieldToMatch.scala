package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments. 
    */
  var AllQueryArguments: js.UndefOr[typings.awsSdk.clientsWafv2Mod.AllQueryArguments] = js.undefined
  
  /**
    * Inspect the request body as plain text. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.  Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host service. For information about how to handle oversized request bodies, see the Body object configuration. 
    */
  var Body: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Body] = js.undefined
  
  /**
    * Inspect the request cookies. You must configure scope and pattern matching filters in the Cookies object, to define the set of cookies and the parts of the cookies that WAF inspects.  Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are forwarded to WAF for inspection by the underlying host service. You must configure how to handle any oversize cookie content in the Cookies object. WAF applies the pattern matching filters to the cookies that it receives from the underlying host service. 
    */
  var Cookies: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Cookies] = js.undefined
  
  /**
    * Inspect the request headers. You must configure scope and pattern matching filters in the Headers object, to define the set of headers to and the parts of the headers that WAF inspects.  Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are forwarded to WAF for inspection by the underlying host service. You must configure how to handle any oversize header content in the Headers object. WAF applies the pattern matching filters to the headers that it receives from the underlying host service. 
    */
  var Headers: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Headers] = js.undefined
  
  /**
    * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.  Only the first 8 KB (8192 bytes) of the request body are forwarded to WAF for inspection by the underlying host service. For information about how to handle oversized request bodies, see the JsonBody object configuration. 
    */
  var JsonBody: js.UndefOr[typings.awsSdk.clientsWafv2Mod.JsonBody] = js.undefined
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform. 
    */
  var Method: js.UndefOr[typings.awsSdk.clientsWafv2Mod.Method] = js.undefined
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a ? character, if any.
    */
  var QueryString: js.UndefOr[typings.awsSdk.clientsWafv2Mod.QueryString] = js.undefined
  
  /**
    * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn't case sensitive. Example JSON: "SingleHeader": { "Name": "haystack" }  Alternately, you can filter and inspect all headers with the Headers FieldToMatch setting. 
    */
  var SingleHeader: js.UndefOr[typings.awsSdk.clientsWafv2Mod.SingleHeader] = js.undefined
  
  /**
    * Inspect a single query argument. Provide the name of the query argument to inspect, such as UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.  Example JSON: "SingleQueryArgument": { "Name": "myArgument" } 
    */
  var SingleQueryArgument: js.UndefOr[typings.awsSdk.clientsWafv2Mod.SingleQueryArgument] = js.undefined
  
  /**
    * Inspect the request URI path. This is the part of the web request that identifies a resource, for example, /images/daily-ad.jpg.
    */
  var UriPath: js.UndefOr[typings.awsSdk.clientsWafv2Mod.UriPath] = js.undefined
}
object FieldToMatch {
  
  inline def apply(): FieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldToMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldToMatch] (val x: Self) extends AnyVal {
    
    inline def setAllQueryArguments(value: AllQueryArguments): Self = StObject.set(x, "AllQueryArguments", value.asInstanceOf[js.Any])
    
    inline def setAllQueryArgumentsUndefined: Self = StObject.set(x, "AllQueryArguments", js.undefined)
    
    inline def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setCookies(value: Cookies): Self = StObject.set(x, "Cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "Cookies", js.undefined)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
    
    inline def setJsonBody(value: JsonBody): Self = StObject.set(x, "JsonBody", value.asInstanceOf[js.Any])
    
    inline def setJsonBodyUndefined: Self = StObject.set(x, "JsonBody", js.undefined)
    
    inline def setMethod(value: Method): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "Method", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
    
    inline def setSingleHeader(value: SingleHeader): Self = StObject.set(x, "SingleHeader", value.asInstanceOf[js.Any])
    
    inline def setSingleHeaderUndefined: Self = StObject.set(x, "SingleHeader", js.undefined)
    
    inline def setSingleQueryArgument(value: SingleQueryArgument): Self = StObject.set(x, "SingleQueryArgument", value.asInstanceOf[js.Any])
    
    inline def setSingleQueryArgumentUndefined: Self = StObject.set(x, "SingleQueryArgument", js.undefined)
    
    inline def setUriPath(value: UriPath): Self = StObject.set(x, "UriPath", value.asInstanceOf[js.Any])
    
    inline def setUriPathUndefined: Self = StObject.set(x, "UriPath", js.undefined)
  }
}
