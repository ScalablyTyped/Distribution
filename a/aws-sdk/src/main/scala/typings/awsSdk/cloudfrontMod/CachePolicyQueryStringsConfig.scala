package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicyQueryStringsConfig extends StObject {
  
  /**
    * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are:    none – Query strings in viewer requests are not included in the cache key and are not automatically included in requests that CloudFront sends to the origin. Even when this field is set to none, any query strings that are listed in an OriginRequestPolicy are included in origin requests.    whitelist – The query strings in viewer requests that are listed in the QueryStringNames type are included in the cache key and automatically included in requests that CloudFront sends to the origin.    allExcept – All query strings in viewer requests that are  not  listed in the QueryStringNames type are included in the cache key and automatically included in requests that CloudFront sends to the origin.    all – All query strings in viewer requests are included in the cache key and are automatically included in requests that CloudFront sends to the origin.  
    */
  var QueryStringBehavior: CachePolicyQueryStringBehavior = js.native
  
  /**
    * Contains the specific query strings in viewer requests that either  are  or  are not  included in the cache key and automatically included in requests that CloudFront sends to the origin. The behavior depends on whether the QueryStringBehavior field in the CachePolicyQueryStringsConfig type is set to whitelist (the listed query strings  are  included) or allExcept (the listed query strings  are not  included, but all other query strings are).
    */
  var QueryStrings: js.UndefOr[QueryStringNames] = js.native
}
object CachePolicyQueryStringsConfig {
  
  @scala.inline
  def apply(QueryStringBehavior: CachePolicyQueryStringBehavior): CachePolicyQueryStringsConfig = {
    val __obj = js.Dynamic.literal(QueryStringBehavior = QueryStringBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyQueryStringsConfig]
  }
  
  @scala.inline
  implicit class CachePolicyQueryStringsConfigMutableBuilder[Self <: CachePolicyQueryStringsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryStringBehavior(value: CachePolicyQueryStringBehavior): Self = StObject.set(x, "QueryStringBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStrings(value: QueryStringNames): Self = StObject.set(x, "QueryStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsUndefined: Self = StObject.set(x, "QueryStrings", js.undefined)
  }
}
