package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicyConfig extends js.Object {
  
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
  implicit class OriginRequestPolicyConfigOps[Self <: OriginRequestPolicyConfig] (val x: Self) extends AnyVal {
    
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
    def setCookiesConfig(value: OriginRequestPolicyCookiesConfig): Self = this.set("CookiesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersConfig(value: OriginRequestPolicyHeadersConfig): Self = this.set("HeadersConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsConfig(value: OriginRequestPolicyQueryStringsConfig): Self = this.set("QueryStringsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
