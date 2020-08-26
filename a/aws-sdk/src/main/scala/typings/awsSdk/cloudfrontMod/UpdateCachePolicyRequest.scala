package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCachePolicyRequest extends js.Object {
  /**
    * A cache policy configuration.
    */
  var CachePolicyConfig: typings.awsSdk.cloudfrontMod.CachePolicyConfig = js.native
  /**
    * The unique identifier for the cache policy that you are updating. The identifier is returned in a cache behavior’s CachePolicyId field in the response to GetDistributionConfig.
    */
  var Id: String = js.native
  /**
    * The version of the cache policy that you are updating. The version is returned in the cache policy’s ETag field in the response to GetCachePolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateCachePolicyRequest {
  @scala.inline
  def apply(CachePolicyConfig: CachePolicyConfig, Id: String): UpdateCachePolicyRequest = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCachePolicyRequest]
  }
  @scala.inline
  implicit class UpdateCachePolicyRequestOps[Self <: UpdateCachePolicyRequest] (val x: Self) extends AnyVal {
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
    def setCachePolicyConfig(value: CachePolicyConfig): Self = this.set("CachePolicyConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

