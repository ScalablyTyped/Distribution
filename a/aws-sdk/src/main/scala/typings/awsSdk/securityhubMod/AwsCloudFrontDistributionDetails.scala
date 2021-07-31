package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionDetails extends StObject {
  
  /**
    * Provides information about the cache configuration for the distribution.
    */
  var CacheBehaviors: js.UndefOr[AwsCloudFrontDistributionCacheBehaviors] = js.undefined
  
  /**
    * The default cache behavior for the configuration.
    */
  var DefaultCacheBehavior: js.UndefOr[AwsCloudFrontDistributionDefaultCacheBehavior] = js.undefined
  
  /**
    * The object that CloudFront sends in response to requests from the origin (for example, index.html) when a viewer requests the root URL for the distribution (http://www.example.com) instead of an object in your distribution (http://www.example.com/product-description.html). 
    */
  var DefaultRootObject: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The domain name corresponding to the distribution.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The entity tag is a hash of the object.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when that the distribution was last modified. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastModifiedTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  var Logging: js.UndefOr[AwsCloudFrontDistributionLogging] = js.undefined
  
  /**
    * Provides information about the origin groups in the distribution.
    */
  var OriginGroups: js.UndefOr[AwsCloudFrontDistributionOriginGroups] = js.undefined
  
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins] = js.undefined
  
  /**
    * Indicates the current status of the distribution.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFrontDistributionDetails {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionDetailsMutableBuilder[Self <: AwsCloudFrontDistributionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheBehaviors(value: AwsCloudFrontDistributionCacheBehaviors): Self = StObject.set(x, "CacheBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheBehaviorsUndefined: Self = StObject.set(x, "CacheBehaviors", js.undefined)
    
    @scala.inline
    def setDefaultCacheBehavior(value: AwsCloudFrontDistributionDefaultCacheBehavior): Self = StObject.set(x, "DefaultCacheBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCacheBehaviorUndefined: Self = StObject.set(x, "DefaultCacheBehavior", js.undefined)
    
    @scala.inline
    def setDefaultRootObject(value: NonEmptyString): Self = StObject.set(x, "DefaultRootObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootObjectUndefined: Self = StObject.set(x, "DefaultRootObject", js.undefined)
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setETag(value: NonEmptyString): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: NonEmptyString): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setLogging(value: AwsCloudFrontDistributionLogging): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "Logging", js.undefined)
    
    @scala.inline
    def setOriginGroups(value: AwsCloudFrontDistributionOriginGroups): Self = StObject.set(x, "OriginGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginGroupsUndefined: Self = StObject.set(x, "OriginGroups", js.undefined)
    
    @scala.inline
    def setOrigins(value: AwsCloudFrontDistributionOrigins): Self = StObject.set(x, "Origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsUndefined: Self = StObject.set(x, "Origins", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setWebAclId(value: NonEmptyString): Self = StObject.set(x, "WebAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAclIdUndefined: Self = StObject.set(x, "WebAclId", js.undefined)
  }
}
