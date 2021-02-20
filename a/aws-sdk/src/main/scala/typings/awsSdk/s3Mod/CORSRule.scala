package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CORSRule extends StObject {
  
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
  implicit class CORSRuleMutableBuilder[Self <: CORSRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedHeaders(value: AllowedHeaders): Self = StObject.set(x, "AllowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeadersUndefined: Self = StObject.set(x, "AllowedHeaders", js.undefined)
    
    @scala.inline
    def setAllowedHeadersVarargs(value: AllowedHeader*): Self = StObject.set(x, "AllowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: AllowedMethods): Self = StObject.set(x, "AllowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMethodsVarargs(value: AllowedMethod*): Self = StObject.set(x, "AllowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: AllowedOrigins): Self = StObject.set(x, "AllowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: AllowedOrigin*): Self = StObject.set(x, "AllowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: ExposeHeaders): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: ExposeHeader*): Self = StObject.set(x, "ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaxAgeSeconds(value: MaxAgeSeconds): Self = StObject.set(x, "MaxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeSecondsUndefined: Self = StObject.set(x, "MaxAgeSeconds", js.undefined)
  }
}
