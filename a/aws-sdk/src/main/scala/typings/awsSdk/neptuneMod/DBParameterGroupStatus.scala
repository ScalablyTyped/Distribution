package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBParameterGroupStatus extends js.Object {
  /**
    * The name of the DP parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
}

object DBParameterGroupStatus {
  @scala.inline
  def apply(DBParameterGroupName: String = null, ParameterApplyStatus: String = null): DBParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName.asInstanceOf[js.Any])
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBParameterGroupStatus]
  }
}

