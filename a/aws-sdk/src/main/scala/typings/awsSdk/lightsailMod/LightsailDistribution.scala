package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightsailDistribution extends StObject {
  
  /**
    * Indicates whether the bundle that is currently applied to your distribution, specified using the distributionName parameter, can be changed to another bundle. Use the UpdateDistributionBundle action to change your distribution's bundle.
    */
  var ableToUpdateBundle: js.UndefOr[Boolean] = js.native
  
  /**
    * The alternate domain names of the distribution.
    */
  var alternativeDomainNames: js.UndefOr[StringList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the distribution.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of the bundle currently applied to the distribution.
    */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * An object that describes the cache behavior settings of the distribution.
    */
  var cacheBehaviorSettings: js.UndefOr[CacheSettings] = js.native
  
  /**
    * An array of objects that describe the per-path cache behavior of the distribution.
    */
  var cacheBehaviors: js.UndefOr[CacheBehaviorList] = js.native
  
  /**
    * The name of the SSL/TLS certificate attached to the distribution, if any.
    */
  var certificateName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The timestamp when the distribution was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * An object that describes the default cache behavior of the distribution.
    */
  var defaultCacheBehavior: js.UndefOr[CacheBehavior] = js.native
  
  /**
    * The domain name of the distribution.
    */
  var domainName: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the distribution is enabled.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An object that describes the location of the distribution, such as the AWS Region and Availability Zone.  Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its content globally. However, all distributions are located in the us-east-1 Region. 
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the distribution.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * An object that describes the origin resource of the distribution, such as a Lightsail instance or load balancer. The distribution pulls, caches, and serves content from the origin.
    */
  var origin: js.UndefOr[Origin] = js.native
  
  /**
    * The public DNS of the origin.
    */
  var originPublicDNS: js.UndefOr[String] = js.native
  
  /**
    * The Lightsail resource type (e.g., Distribution).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The status of the distribution.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail distribution. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object LightsailDistribution {
  
  @scala.inline
  def apply(): LightsailDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightsailDistribution]
  }
  
  @scala.inline
  implicit class LightsailDistributionMutableBuilder[Self <: LightsailDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbleToUpdateBundle(value: Boolean): Self = StObject.set(x, "ableToUpdateBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbleToUpdateBundleUndefined: Self = StObject.set(x, "ableToUpdateBundle", js.undefined)
    
    @scala.inline
    def setAlternativeDomainNames(value: StringList): Self = StObject.set(x, "alternativeDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeDomainNamesUndefined: Self = StObject.set(x, "alternativeDomainNames", js.undefined)
    
    @scala.inline
    def setAlternativeDomainNamesVarargs(value: String*): Self = StObject.set(x, "alternativeDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setCacheBehaviorSettings(value: CacheSettings): Self = StObject.set(x, "cacheBehaviorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheBehaviorSettingsUndefined: Self = StObject.set(x, "cacheBehaviorSettings", js.undefined)
    
    @scala.inline
    def setCacheBehaviors(value: CacheBehaviorList): Self = StObject.set(x, "cacheBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheBehaviorsUndefined: Self = StObject.set(x, "cacheBehaviors", js.undefined)
    
    @scala.inline
    def setCacheBehaviorsVarargs(value: CacheBehaviorPerPath*): Self = StObject.set(x, "cacheBehaviors", js.Array(value :_*))
    
    @scala.inline
    def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDefaultCacheBehavior(value: CacheBehavior): Self = StObject.set(x, "defaultCacheBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCacheBehaviorUndefined: Self = StObject.set(x, "defaultCacheBehavior", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigin(value: Origin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPublicDNS(value: String): Self = StObject.set(x, "originPublicDNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPublicDNSUndefined: Self = StObject.set(x, "originPublicDNS", js.undefined)
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
