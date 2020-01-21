package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBParameterGroupNameMessage extends js.Object {
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
}

object DBParameterGroupNameMessage {
  @scala.inline
  def apply(DBParameterGroupName: String = null): DBParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBParameterGroupNameMessage]
  }
}

