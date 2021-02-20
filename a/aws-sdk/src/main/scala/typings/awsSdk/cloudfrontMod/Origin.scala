package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Origin extends StObject {
  
  /**
    * The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the maximum is 3, and the default (if you don’t specify otherwise) is 3. For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this value also specifies the number of times that CloudFront attempts to get a response from the origin, in the case of an Origin Response Timeout. For more information, see Origin Connection Attempts in the Amazon CloudFront Developer Guide.
    */
  var ConnectionAttempts: js.UndefOr[integer] = js.native
  
  /**
    * The number of seconds that CloudFront waits when trying to establish a connection to the origin. The minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise) is 10 seconds. For more information, see Origin Connection Timeout in the Amazon CloudFront Developer Guide.
    */
  var ConnectionTimeout: js.UndefOr[integer] = js.native
  
  /**
    * A list of HTTP header names and values that CloudFront adds to the requests that it sends to the origin. For more information, see Adding Custom Headers to Origin Requests in the Amazon CloudFront Developer Guide.
    */
  var CustomHeaders: js.UndefOr[typings.awsSdk.cloudfrontMod.CustomHeaders] = js.native
  
  /**
    * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3 bucket is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured with static website hosting, use the S3OriginConfig type instead.
    */
  var CustomOriginConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CustomOriginConfig] = js.native
  
  /**
    * The domain name for the origin. For more information, see Origin Domain Name in the Amazon CloudFront Developer Guide.
    */
  var DomainName: String = js.native
  
  /**
    * A unique identifier for the origin. This value must be unique within the distribution. Use this value to specify the TargetOriginId in a CacheBehavior or DefaultCacheBehavior.
    */
  var Id: String = js.native
  
  /**
    * An optional path that CloudFront appends to the origin domain name when CloudFront requests content from the origin. For more information, see Origin Path in the Amazon CloudFront Developer Guide.
    */
  var OriginPath: js.UndefOr[String] = js.native
  
  /**
    * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin. For more information, see Using Origin Shield in the Amazon CloudFront Developer Guide.
    */
  var OriginShield: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginShield] = js.native
  
  /**
    * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static website hosting, use the CustomOriginConfig type instead.
    */
  var S3OriginConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.S3OriginConfig] = js.native
}
object Origin {
  
  @scala.inline
  def apply(DomainName: String, Id: String): Origin = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  
  @scala.inline
  implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionAttempts(value: integer): Self = StObject.set(x, "ConnectionAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionAttemptsUndefined: Self = StObject.set(x, "ConnectionAttempts", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: integer): Self = StObject.set(x, "ConnectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutUndefined: Self = StObject.set(x, "ConnectionTimeout", js.undefined)
    
    @scala.inline
    def setCustomHeaders(value: CustomHeaders): Self = StObject.set(x, "CustomHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "CustomHeaders", js.undefined)
    
    @scala.inline
    def setCustomOriginConfig(value: CustomOriginConfig): Self = StObject.set(x, "CustomOriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOriginConfigUndefined: Self = StObject.set(x, "CustomOriginConfig", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPath(value: String): Self = StObject.set(x, "OriginPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPathUndefined: Self = StObject.set(x, "OriginPath", js.undefined)
    
    @scala.inline
    def setOriginShield(value: OriginShield): Self = StObject.set(x, "OriginShield", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginShieldUndefined: Self = StObject.set(x, "OriginShield", js.undefined)
    
    @scala.inline
    def setS3OriginConfig(value: S3OriginConfig): Self = StObject.set(x, "S3OriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OriginConfigUndefined: Self = StObject.set(x, "S3OriginConfig", js.undefined)
  }
}
