package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDistributionRequest extends StObject {
  
  /**
    * The bundle ID to use for the distribution. A distribution bundle describes the specifications of your distribution, such as the monthly cost and monthly network transfer quota. Use the GetDistributionBundles action to get a list of distribution bundle IDs that you can specify.
    */
  var bundleId: String = js.native
  
  /**
    * An object that describes the cache behavior settings for the distribution.
    */
  var cacheBehaviorSettings: js.UndefOr[CacheSettings] = js.native
  
  /**
    * An array of objects that describe the per-path cache behavior for the distribution.
    */
  var cacheBehaviors: js.UndefOr[CacheBehaviorList] = js.native
  
  /**
    * An object that describes the default cache behavior for the distribution.
    */
  var defaultCacheBehavior: CacheBehavior = js.native
  
  /**
    * The name for the distribution.
    */
  var distributionName: ResourceName = js.native
  
  /**
    * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer. The distribution pulls, caches, and serves content from the origin.
    */
  var origin: InputOrigin = js.native
  
  /**
    * The tag keys and optional values to add to the distribution during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateDistributionRequest {
  
  @scala.inline
  def apply(
    bundleId: String,
    defaultCacheBehavior: CacheBehavior,
    distributionName: ResourceName,
    origin: InputOrigin
  ): CreateDistributionRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], defaultCacheBehavior = defaultCacheBehavior.asInstanceOf[js.Any], distributionName = distributionName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionRequest]
  }
  
  @scala.inline
  implicit class CreateDistributionRequestMutableBuilder[Self <: CreateDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
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
    def setDefaultCacheBehavior(value: CacheBehavior): Self = StObject.set(x, "defaultCacheBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: InputOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
