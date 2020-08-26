package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePolicyConfig extends js.Object {
  /**
    * A comment to describe the cache policy.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated. CloudFront uses this value as the object’s time to live (TTL) only when the origin does not send Cache-Control or Expires headers with the object. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. The default value for this field is 86400 seconds (one day). If the value of MinTTL is more than 86400 seconds, then the default value for this field is the same as the value of MinTTL.
    */
  var DefaultTTL: js.UndefOr[long] = js.native
  /**
    * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated. CloudFront uses this value only when the origin sends Cache-Control or Expires headers with the object. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. The default value for this field is 31536000 seconds (one year). If the value of MinTTL or DefaultTTL is more than 31536000 seconds, then the default value for this field is the same as the value of DefaultTTL.
    */
  var MaxTTL: js.UndefOr[long] = js.native
  /**
    * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var MinTTL: long = js.native
  /**
    * A unique name to identify the cache policy.
    */
  var Name: String = js.native
  /**
    * The HTTP headers, cookies, and URL query strings to include in the cache key. The values included in the cache key are automatically included in requests that CloudFront sends to the origin.
    */
  var ParametersInCacheKeyAndForwardedToOrigin: js.UndefOr[typings.awsSdk.cloudfrontMod.ParametersInCacheKeyAndForwardedToOrigin] = js.native
}

object CachePolicyConfig {
  @scala.inline
  def apply(MinTTL: long, Name: String): CachePolicyConfig = {
    val __obj = js.Dynamic.literal(MinTTL = MinTTL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyConfig]
  }
  @scala.inline
  implicit class CachePolicyConfigOps[Self <: CachePolicyConfig] (val x: Self) extends AnyVal {
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
    def setMinTTL(value: long): Self = this.set("MinTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    @scala.inline
    def setDefaultTTL(value: long): Self = this.set("DefaultTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTTL: Self = this.set("DefaultTTL", js.undefined)
    @scala.inline
    def setMaxTTL(value: long): Self = this.set("MaxTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTTL: Self = this.set("MaxTTL", js.undefined)
    @scala.inline
    def setParametersInCacheKeyAndForwardedToOrigin(value: ParametersInCacheKeyAndForwardedToOrigin): Self = this.set("ParametersInCacheKeyAndForwardedToOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParametersInCacheKeyAndForwardedToOrigin: Self = this.set("ParametersInCacheKeyAndForwardedToOrigin", js.undefined)
  }
  
}

