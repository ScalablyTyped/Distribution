package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments. 
    */
  var AllQueryArguments: js.UndefOr[typings.awsSdk.wafv2Mod.AllQueryArguments] = js.native
  
  /**
    * Inspect the request body, which immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.  Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection by the underlying host service. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow additional bytes in by combining a statement that inspects the body of the web request, such as ByteMatchStatement or RegexPatternSetReferenceStatement, with a SizeConstraintStatement that enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of web requests whose bodies exceed the 8 KB limit.
    */
  var Body: js.UndefOr[typings.awsSdk.wafv2Mod.Body] = js.native
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform. 
    */
  var Method: js.UndefOr[typings.awsSdk.wafv2Mod.Method] = js.native
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a ? character, if any.
    */
  var QueryString: js.UndefOr[typings.awsSdk.wafv2Mod.QueryString] = js.native
  
  /**
    * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn't case sensitive.
    */
  var SingleHeader: js.UndefOr[typings.awsSdk.wafv2Mod.SingleHeader] = js.native
  
  /**
    * Inspect a single query argument. Provide the name of the query argument to inspect, such as UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.  This is used only to indicate the web request component for AWS WAF to inspect, in the FieldToMatch specification. 
    */
  var SingleQueryArgument: js.UndefOr[typings.awsSdk.wafv2Mod.SingleQueryArgument] = js.native
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
    */
  var UriPath: js.UndefOr[typings.awsSdk.wafv2Mod.UriPath] = js.native
}
object FieldToMatch {
  
  @scala.inline
  def apply(): FieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldToMatch]
  }
  
  @scala.inline
  implicit class FieldToMatchMutableBuilder[Self <: FieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllQueryArguments(value: AllQueryArguments): Self = StObject.set(x, "AllQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllQueryArgumentsUndefined: Self = StObject.set(x, "AllQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setMethod(value: Method): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "Method", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(value: SingleHeader): Self = StObject.set(x, "SingleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHeaderUndefined: Self = StObject.set(x, "SingleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(value: SingleQueryArgument): Self = StObject.set(x, "SingleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQueryArgumentUndefined: Self = StObject.set(x, "SingleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(value: UriPath): Self = StObject.set(x, "UriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPathUndefined: Self = StObject.set(x, "UriPath", js.undefined)
  }
}
