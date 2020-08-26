package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionRequest extends js.Object {
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
  implicit class CreateDistributionRequestOps[Self <: CreateDistributionRequest] (val x: Self) extends AnyVal {
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCacheBehavior(value: CacheBehavior): Self = this.set("defaultCacheBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: InputOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
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
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

