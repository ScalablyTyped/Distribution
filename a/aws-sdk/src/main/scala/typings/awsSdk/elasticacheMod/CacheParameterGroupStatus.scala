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
  def apply(
    CacheNodeIdsToReboot: CacheNodeIdsList = null,
    CacheParameterGroupName: String = null,
    ParameterApplyStatus: String = null
  ): CacheParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeIdsToReboot != null) __obj.updateDynamic("CacheNodeIdsToReboot")(CacheNodeIdsToReboot.asInstanceOf[js.Any])
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName.asInstanceOf[js.Any])
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheParameterGroupStatus]
  }
}

