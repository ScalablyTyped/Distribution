package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicyConfig extends StObject {
  
  /**
    * A comment to describe the origin request policy.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * The cookies from viewer requests to include in origin requests.
    */
  var CookiesConfig: OriginRequestPolicyCookiesConfig = js.native
  
  /**
    * The HTTP headers to include in origin requests. These can include headers from viewer requests and additional headers added by CloudFront.
    */
  var HeadersConfig: OriginRequestPolicyHeadersConfig = js.native
  
  /**
    * A unique name to identify the origin request policy.
    */
  var Name: String = js.native
  
  /**
    * The URL query strings from viewer requests to include in origin requests.
    */
  var QueryStringsConfig: OriginRequestPolicyQueryStringsConfig = js.native
}
object OriginRequestPolicyConfig {
  
  @scala.inline
  def apply(
    CookiesConfig: OriginRequestPolicyCookiesConfig,
    HeadersConfig: OriginRequestPolicyHeadersConfig,
    Name: String,
    QueryStringsConfig: OriginRequestPolicyQueryStringsConfig
  ): OriginRequestPolicyConfig = {
    val __obj = js.Dynamic.literal(CookiesConfig = CookiesConfig.asInstanceOf[js.Any], HeadersConfig = HeadersConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryStringsConfig = QueryStringsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyConfig]
  }
  
  @scala.inline
  implicit class OriginRequestPolicyConfigMutableBuilder[Self <: OriginRequestPolicyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setCookiesConfig(value: OriginRequestPolicyCookiesConfig): Self = StObject.set(x, "CookiesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersConfig(value: OriginRequestPolicyHeadersConfig): Self = StObject.set(x, "HeadersConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsConfig(value: OriginRequestPolicyQueryStringsConfig): Self = StObject.set(x, "QueryStringsConfig", value.asInstanceOf[js.Any])
  }
}
