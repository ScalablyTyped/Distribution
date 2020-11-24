package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CORSRule extends js.Object {
  
  /**
    * Headers that are specified in the Access-Control-Request-Headers header. These headers are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any requested headers that are allowed.
    */
  var AllowedHeaders: js.UndefOr[typings.awsSdk.s3Mod.AllowedHeaders] = js.native
  
  /**
    * An HTTP method that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
    */
  var AllowedMethods: typings.awsSdk.s3Mod.AllowedMethods = js.native
  
  /**
    * One or more origins you want customers to be able to access the bucket from.
    */
  var AllowedOrigins: typings.awsSdk.s3Mod.AllowedOrigins = js.native
  
  /**
    * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
    */
  var ExposeHeaders: js.UndefOr[typings.awsSdk.s3Mod.ExposeHeaders] = js.native
  
  /**
    * The time in seconds that your browser is to cache the preflight response for the specified resource.
    */
  var MaxAgeSeconds: js.UndefOr[typings.awsSdk.s3Mod.MaxAgeSeconds] = js.native
}
object CORSRule {
  
  @scala.inline
  def apply(AllowedMethods: AllowedMethods, AllowedOrigins: AllowedOrigins): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  
  @scala.inline
  implicit class CORSRuleOps[Self <: CORSRule] (val x: Self) extends AnyVal {
    
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
    def setAllowedMethodsVarargs(value: AllowedMethod*): Self = this.set("AllowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: AllowedMethods): Self = this.set("AllowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: AllowedOrigin*): Self = this.set("AllowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: AllowedOrigins): Self = this.set("AllowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeadersVarargs(value: AllowedHeader*): Self = this.set("AllowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeaders(value: AllowedHeaders): Self = this.set("AllowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("AllowedHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: ExposeHeader*): Self = this.set("ExposeHeaders", js.Array(value :_*))
    
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
