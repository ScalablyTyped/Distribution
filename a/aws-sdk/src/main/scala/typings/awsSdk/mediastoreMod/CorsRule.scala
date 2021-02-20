package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsRule extends StObject {
  
  /**
    * Specifies which headers are allowed in a preflight OPTIONS request through the Access-Control-Request-Headers header. Each header name that is specified in Access-Control-Request-Headers must have a corresponding entry in the rule. Only the headers that were requested are sent back.  This element can contain only one wildcard character (*).
    */
  var AllowedHeaders: typings.awsSdk.mediastoreMod.AllowedHeaders = js.native
  
  /**
    * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute. Each CORS rule must contain at least one AllowedMethods and one AllowedOrigins element.
    */
  var AllowedMethods: js.UndefOr[typings.awsSdk.mediastoreMod.AllowedMethods] = js.native
  
  /**
    * One or more response headers that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). Each CORS rule must have at least one AllowedOrigins element. The string value can include only one wildcard character (*), for example, http:// *.example.com. Additionally, you can specify only one wildcard character to allow cross-origin access for all origins.
    */
  var AllowedOrigins: typings.awsSdk.mediastoreMod.AllowedOrigins = js.native
  
  /**
    * One or more headers in the response that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). This element is optional for each rule.
    */
  var ExposeHeaders: js.UndefOr[typings.awsSdk.mediastoreMod.ExposeHeaders] = js.native
  
  /**
    * The time in seconds that your browser caches the preflight response for the specified resource. A CORS rule can have only one MaxAgeSeconds element.
    */
  var MaxAgeSeconds: js.UndefOr[typings.awsSdk.mediastoreMod.MaxAgeSeconds] = js.native
}
object CorsRule {
  
  @scala.inline
  def apply(AllowedHeaders: AllowedHeaders, AllowedOrigins: AllowedOrigins): CorsRule = {
    val __obj = js.Dynamic.literal(AllowedHeaders = AllowedHeaders.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsRule]
  }
  
  @scala.inline
  implicit class CorsRuleMutableBuilder[Self <: CorsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedHeaders(value: AllowedHeaders): Self = StObject.set(x, "AllowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeadersVarargs(value: Header*): Self = StObject.set(x, "AllowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: AllowedMethods): Self = StObject.set(x, "AllowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMethodsUndefined: Self = StObject.set(x, "AllowedMethods", js.undefined)
    
    @scala.inline
    def setAllowedMethodsVarargs(value: MethodName*): Self = StObject.set(x, "AllowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: AllowedOrigins): Self = StObject.set(x, "AllowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: Origin*): Self = StObject.set(x, "AllowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: ExposeHeaders): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: Header*): Self = StObject.set(x, "ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaxAgeSeconds(value: MaxAgeSeconds): Self = StObject.set(x, "MaxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeSecondsUndefined: Self = StObject.set(x, "MaxAgeSeconds", js.undefined)
  }
}
