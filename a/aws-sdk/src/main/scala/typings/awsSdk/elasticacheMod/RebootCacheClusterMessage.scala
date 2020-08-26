package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootCacheClusterMessage extends js.Object {
  /**
    * The cluster identifier. This parameter is stored as a lowercase string.
    */
  var CacheClusterId: String = js.native
  /**
    * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache node IDs.
    */
  var CacheNodeIdsToReboot: CacheNodeIdsList = js.native
}

object RebootCacheClusterMessage {
  @scala.inline
  def apply(CacheClusterId: String, CacheNodeIdsToReboot: CacheNodeIdsList): RebootCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any], CacheNodeIdsToReboot = CacheNodeIdsToReboot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootCacheClusterMessage]
  }
  @scala.inline
  implicit class RebootCacheClusterMessageOps[Self <: RebootCacheClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheNodeIdsToRebootVarargs(value: String*): Self = this.set("CacheNodeIdsToReboot", js.Array(value :_*))
    @scala.inline
    def setCacheNodeIdsToReboot(value: CacheNodeIdsList): Self = this.set("CacheNodeIdsToReboot", value.asInstanceOf[js.Any])
  }
  
}

