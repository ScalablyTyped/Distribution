package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePolicy extends js.Object {
  /**
    * The cache policy configuration.
    */
  var CachePolicyConfig: typings.awsSdk.cloudfrontMod.CachePolicyConfig = js.native
  /**
    * The unique identifier for the cache policy.
    */
  var Id: String = js.native
  /**
    * The date and time when the cache policy was last modified.
    */
  var LastModifiedTime: timestamp = js.native
}

object CachePolicy {
  @scala.inline
  def apply(CachePolicyConfig: CachePolicyConfig, Id: String, LastModifiedTime: timestamp): CachePolicy = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicy]
  }
  @scala.inline
  implicit class CachePolicyOps[Self <: CachePolicy] (val x: Self) extends AnyVal {
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
    def setLastModifiedTime(value: timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
  }
  
}

