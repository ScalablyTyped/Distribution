package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionRequest extends StObject {
  
  /**
    * An object that describes the cache behavior settings for the distribution.  The cacheBehaviorSettings specified in your UpdateDistributionRequest will replace your distribution's existing settings. 
    */
  var cacheBehaviorSettings: js.UndefOr[CacheSettings] = js.undefined
  
  /**
    * An array of objects that describe the per-path cache behavior for the distribution.
    */
  var cacheBehaviors: js.UndefOr[CacheBehaviorList] = js.undefined
  
  /**
    * An object that describes the default cache behavior for the distribution.
    */
  var defaultCacheBehavior: js.UndefOr[CacheBehavior] = js.undefined
  
  /**
    * The name of the distribution to update. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName
  
  /**
    * Indicates whether to enable the distribution.
    */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer. The distribution pulls, caches, and serves content from the origin.
    */
  var origin: js.UndefOr[InputOrigin] = js.undefined
}
object UpdateDistributionRequest {
  
  @scala.inline
  def apply(distributionName: ResourceName): UpdateDistributionRequest = {
    val __obj = js.Dynamic.literal(distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionRequest]
  }
  
  @scala.inline
  implicit class UpdateDistributionRequestMutableBuilder[Self <: UpdateDistributionRequest] (val x: Self) extends AnyVal {
    
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
    def setDefaultCacheBehaviorUndefined: Self = StObject.set(x, "defaultCacheBehavior", js.undefined)
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setOrigin(value: InputOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
