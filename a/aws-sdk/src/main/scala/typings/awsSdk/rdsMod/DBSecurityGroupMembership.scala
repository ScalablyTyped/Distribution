package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSecurityGroupMembership extends js.Object {
  /**
    * The name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The status of the DB security group.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBSecurityGroupMembership {
  @scala.inline
  def apply(DBSecurityGroupName: String = null, Status: String = null): DBSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroupName != null) __obj.updateDynamic("DBSecurityGroupName")(DBSecurityGroupName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSecurityGroupMembership]
  }
}

