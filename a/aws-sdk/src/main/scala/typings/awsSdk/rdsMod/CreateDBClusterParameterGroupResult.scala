package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterParameterGroupResult extends js.Object {
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.rdsMod.DBClusterParameterGroup] = js.native
}

object CreateDBClusterParameterGroupResult {
  @scala.inline
  def apply(DBClusterParameterGroup: DBClusterParameterGroup = null): CreateDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
  }
}

