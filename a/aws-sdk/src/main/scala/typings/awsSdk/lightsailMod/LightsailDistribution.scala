package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightsailDistribution extends js.Object {
  
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
  implicit class LightsailDistributionOps[Self <: LightsailDistribution] (val x: Self) extends AnyVal {
    
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
    def setAbleToUpdateBundle(value: Boolean): Self = this.set("ableToUpdateBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbleToUpdateBundle: Self = this.set("ableToUpdateBundle", js.undefined)
    
    @scala.inline
    def setAlternativeDomainNamesVarargs(value: String*): Self = this.set("alternativeDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setAlternativeDomainNames(value: StringList): Self = this.set("alternativeDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeDomainNames: Self = this.set("alternativeDomainNames", js.undefined)
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setCacheBehaviorSettings(value: CacheSettings): Self = this.set("cacheBehaviorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheBehaviorSettings: Self = this.set("cacheBehaviorSettings", js.undefined)
    
    @scala.inline
    def setCacheBehaviorsVarargs(value: CacheBehaviorPerPath*): Self = this.set("cacheBehaviors", js.Array(value :_*))
    
    @scala.inline
    def setCacheBehaviors(value: CacheBehaviorList): Self = this.set("cacheBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheBehaviors: Self = this.set("cacheBehaviors", js.undefined)
    
    @scala.inline
    def setCertificateName(value: ResourceName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDefaultCacheBehavior(value: CacheBehavior): Self = this.set("defaultCacheBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCacheBehavior: Self = this.set("defaultCacheBehavior", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrigin(value: Origin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setOriginPublicDNS(value: String): Self = this.set("originPublicDNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginPublicDNS: Self = this.set("originPublicDNS", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
