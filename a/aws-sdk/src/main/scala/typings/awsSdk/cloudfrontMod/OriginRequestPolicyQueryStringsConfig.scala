package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicyQueryStringsConfig extends js.Object {
  
  /**
    * Determines whether any URL query strings in viewer requests are included in requests that CloudFront sends to the origin. Valid values are:    none – Query strings in viewer requests are not included in requests that CloudFront sends to the origin. Even when this field is set to none, any query strings that are listed in a CachePolicy are included in origin requests.    whitelist – The query strings in viewer requests that are listed in the QueryStringNames type are included in requests that CloudFront sends to the origin.    all – All query strings in viewer requests are included in requests that CloudFront sends to the origin.  
    */
  var QueryStringBehavior: OriginRequestPolicyQueryStringBehavior = js.native
  
  /**
    * Contains a list of the query strings in viewer requests that are included in requests that CloudFront sends to the origin.
    */
  var QueryStrings: js.UndefOr[QueryStringNames] = js.native
}
object OriginRequestPolicyQueryStringsConfig {
  
  @scala.inline
  def apply(QueryStringBehavior: OriginRequestPolicyQueryStringBehavior): OriginRequestPolicyQueryStringsConfig = {
    val __obj = js.Dynamic.literal(QueryStringBehavior = QueryStringBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyQueryStringsConfig]
  }
  
  @scala.inline
  implicit class OriginRequestPolicyQueryStringsConfigOps[Self <: OriginRequestPolicyQueryStringsConfig] (val x: Self) extends AnyVal {
    
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
    def setQueryStringBehavior(value: OriginRequestPolicyQueryStringBehavior): Self = this.set("QueryStringBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStrings(value: QueryStringNames): Self = this.set("QueryStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStrings: Self = this.set("QueryStrings", js.undefined)
  }
}
