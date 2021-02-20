package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicyConfig extends StObject {
  
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
  implicit class CachePolicyConfigMutableBuilder[Self <: CachePolicyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setDefaultTTL(value: long): Self = StObject.set(x, "DefaultTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTTLUndefined: Self = StObject.set(x, "DefaultTTL", js.undefined)
    
    @scala.inline
    def setMaxTTL(value: long): Self = StObject.set(x, "MaxTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTTLUndefined: Self = StObject.set(x, "MaxTTL", js.undefined)
    
    @scala.inline
    def setMinTTL(value: long): Self = StObject.set(x, "MinTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersInCacheKeyAndForwardedToOrigin(value: ParametersInCacheKeyAndForwardedToOrigin): Self = StObject.set(x, "ParametersInCacheKeyAndForwardedToOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersInCacheKeyAndForwardedToOriginUndefined: Self = StObject.set(x, "ParametersInCacheKeyAndForwardedToOrigin", js.undefined)
  }
}
