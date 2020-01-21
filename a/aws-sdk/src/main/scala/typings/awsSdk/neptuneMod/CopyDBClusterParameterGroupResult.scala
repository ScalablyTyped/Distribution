package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBClusterParameterGroupResult extends js.Object {
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.neptuneMod.DBClusterParameterGroup] = js.native
}

object CopyDBClusterParameterGroupResult {
  @scala.inline
  def apply(DBClusterParameterGroup: DBClusterParameterGroup = null): CopyDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
  }
}

