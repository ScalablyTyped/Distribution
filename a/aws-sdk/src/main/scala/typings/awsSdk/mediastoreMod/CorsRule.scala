package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsRule extends js.Object {
  
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
  implicit class CorsRuleOps[Self <: CorsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedHeadersVarargs(value: Header*): Self = this.set("AllowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeaders(value: AllowedHeaders): Self = this.set("AllowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: Origin*): Self = this.set("AllowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: AllowedOrigins): Self = this.set("AllowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMethodsVarargs(value: MethodName*): Self = this.set("AllowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: AllowedMethods): Self = this.set("AllowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedMethods: Self = this.set("AllowedMethods", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: Header*): Self = this.set("ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: ExposeHeaders): Self = this.set("ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("ExposeHeaders", js.undefined)
    
    @scala.inline
    def setMaxAgeSeconds(value: MaxAgeSeconds): Self = this.set("MaxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("MaxAgeSeconds", js.undefined)
  }
}
