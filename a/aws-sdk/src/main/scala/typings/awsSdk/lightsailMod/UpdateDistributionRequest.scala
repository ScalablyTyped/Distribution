package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionRequest extends js.Object {
  /**
    * An object that describes the cache behavior settings for the distribution.  The cacheBehaviorSettings specified in your UpdateDistributionRequest will replace your distribution's existing settings. 
    */
  var cacheBehaviorSettings: js.UndefOr[CacheSettings] = js.native
  /**
    * An array of objects that describe the per-path cache behavior for the distribution.
    */
  var cacheBehaviors: js.UndefOr[CacheBehaviorList] = js.native
  /**
    * An object that describes the default cache behavior for the distribution.
    */
  var defaultCacheBehavior: js.UndefOr[CacheBehavior] = js.native
  /**
    * The name of the distribution to update. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName = js.native
  /**
    * Indicates whether to enable the distribution.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  /**
    * An object that describes the origin resource for the distribution, such as a Lightsail instance or load balancer. The distribution pulls, caches, and serves content from the origin.
    */
  var origin: js.UndefOr[InputOrigin] = js.native
}

object UpdateDistributionRequest {
  @scala.inline
  def apply(distributionName: ResourceName): UpdateDistributionRequest = {
    val __obj = js.Dynamic.literal(distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionRequest]
  }
  @scala.inline
  implicit class UpdateDistributionRequestOps[Self <: UpdateDistributionRequest] (val x: Self) extends AnyVal {
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
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
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
    def setDefaultCacheBehavior(value: CacheBehavior): Self = this.set("defaultCacheBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCacheBehavior: Self = this.set("defaultCacheBehavior", js.undefined)
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setOrigin(value: InputOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

