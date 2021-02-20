package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicyQueryStringsConfig extends StObject {
  
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
  implicit class OriginRequestPolicyQueryStringsConfigMutableBuilder[Self <: OriginRequestPolicyQueryStringsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryStringBehavior(value: OriginRequestPolicyQueryStringBehavior): Self = StObject.set(x, "QueryStringBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStrings(value: QueryStringNames): Self = StObject.set(x, "QueryStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsUndefined: Self = StObject.set(x, "QueryStrings", js.undefined)
  }
}
