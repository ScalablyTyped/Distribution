package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionDetails extends js.Object {
  
  /**
    * Provides information about the cache configuration for the distribution.
    */
  var CacheBehaviors: js.UndefOr[AwsCloudFrontDistributionCacheBehaviors] = js.native
  
  /**
    * The default cache behavior for the configuration.
    */
  var DefaultCacheBehavior: js.UndefOr[AwsCloudFrontDistributionDefaultCacheBehavior] = js.native
  
  /**
    * The object that CloudFront sends in response to requests from the origin (for example, index.html) when a viewer requests the root URL for the distribution (http://www.example.com) instead of an object in your distribution (http://www.example.com/product-description.html). 
    */
  var DefaultRootObject: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The domain name corresponding to the distribution.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The entity tag is a hash of the object.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when that the distribution was last modified. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastModifiedTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  var Logging: js.UndefOr[AwsCloudFrontDistributionLogging] = js.native
  
  /**
    * Provides information about the origin groups in the distribution.
    */
  var OriginGroups: js.UndefOr[AwsCloudFrontDistributionOriginGroups] = js.native
  
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins] = js.native
  
  /**
    * Indicates the current status of the distribution.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.native
}
object AwsCloudFrontDistributionDetails {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionDetailsOps[Self <: AwsCloudFrontDistributionDetails] (val x: Self) extends AnyVal {
    
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
    def setCacheBehaviors(value: AwsCloudFrontDistributionCacheBehaviors): Self = this.set("CacheBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheBehaviors: Self = this.set("CacheBehaviors", js.undefined)
    
    @scala.inline
    def setDefaultCacheBehavior(value: AwsCloudFrontDistributionDefaultCacheBehavior): Self = this.set("DefaultCacheBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCacheBehavior: Self = this.set("DefaultCacheBehavior", js.undefined)
    
    @scala.inline
    def setDefaultRootObject(value: NonEmptyString): Self = this.set("DefaultRootObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootObject: Self = this.set("DefaultRootObject", js.undefined)
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setETag(value: NonEmptyString): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: NonEmptyString): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setLogging(value: AwsCloudFrontDistributionLogging): Self = this.set("Logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("Logging", js.undefined)
    
    @scala.inline
    def setOriginGroups(value: AwsCloudFrontDistributionOriginGroups): Self = this.set("OriginGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginGroups: Self = this.set("OriginGroups", js.undefined)
    
    @scala.inline
    def setOrigins(value: AwsCloudFrontDistributionOrigins): Self = this.set("Origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigins: Self = this.set("Origins", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setWebAclId(value: NonEmptyString): Self = this.set("WebAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAclId: Self = this.set("WebAclId", js.undefined)
  }
}
