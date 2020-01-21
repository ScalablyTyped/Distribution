package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterOptionGroupStatus extends js.Object {
  /**
    * Specifies the name of the DB cluster option group.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the DB cluster option group.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterOptionGroupStatus {
  @scala.inline
  def apply(DBClusterOptionGroupName: String = null, Status: String = null): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (DBClusterOptionGroupName != null) __obj.updateDynamic("DBClusterOptionGroupName")(DBClusterOptionGroupName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
}

