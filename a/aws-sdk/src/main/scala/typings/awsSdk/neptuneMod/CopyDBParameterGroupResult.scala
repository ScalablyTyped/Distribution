package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBParameterGroupResult extends js.Object {
  var DBParameterGroup: js.UndefOr[typings.awsSdk.neptuneMod.DBParameterGroup] = js.native
}

object CopyDBParameterGroupResult {
  @scala.inline
  def apply(DBParameterGroup: DBParameterGroup = null): CopyDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroup != null) __obj.updateDynamic("DBParameterGroup")(DBParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBParameterGroupResult]
  }
}

