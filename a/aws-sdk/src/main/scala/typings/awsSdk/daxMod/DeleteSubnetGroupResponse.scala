package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubnetGroupResponse extends js.Object {
  /**
    * A user-specified message for this action (i.e., a reason for deleting the subnet group).
    */
  var DeletionMessage: js.UndefOr[String] = js.native
}

object DeleteSubnetGroupResponse {
  @scala.inline
  def apply(DeletionMessage: String = null): DeleteSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletionMessage != null) __obj.updateDynamic("DeletionMessage")(DeletionMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubnetGroupResponse]
  }
}

