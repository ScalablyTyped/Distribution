package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveRoleFromDBClusterMessage extends js.Object {
  /**
    * The name of the DB cluster to disassociate the IAM role from.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example arn:aws:iam::123456789012:role/NeptuneAccessRole.
    */
  var RoleArn: String = js.native
}

object RemoveRoleFromDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, RoleArn: String): RemoveRoleFromDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRoleFromDBClusterMessage]
  }
  @scala.inline
  implicit class RemoveRoleFromDBClusterMessageOps[Self <: RemoveRoleFromDBClusterMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
  }
  
}

