package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupStatus extends js.Object {
  /**
    * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.native
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
}

object CacheParameterGroupStatus {
  @scala.inline
  def apply(): CacheParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupStatus]
  }
  @scala.inline
  implicit class CacheParameterGroupStatusOps[Self <: CacheParameterGroupStatus] (val x: Self) extends AnyVal {
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
    def setCacheNodeIdsToRebootVarargs(value: String*): Self = this.set("CacheNodeIdsToReboot", js.Array(value :_*))
    @scala.inline
    def setCacheNodeIdsToReboot(value: CacheNodeIdsList): Self = this.set("CacheNodeIdsToReboot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNodeIdsToReboot: Self = this.set("CacheNodeIdsToReboot", js.undefined)
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheParameterGroupName: Self = this.set("CacheParameterGroupName", js.undefined)
    @scala.inline
    def setParameterApplyStatus(value: String): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
  }
  
}

