package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePolicyQueryStringsConfig extends js.Object {
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
  implicit class CachePolicyQueryStringsConfigOps[Self <: CachePolicyQueryStringsConfig] (val x: Self) extends AnyVal {
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
    def setQueryStringBehavior(value: CachePolicyQueryStringBehavior): Self = this.set("QueryStringBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryStrings(value: QueryStringNames): Self = this.set("QueryStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStrings: Self = this.set("QueryStrings", js.undefined)
  }
  
}

