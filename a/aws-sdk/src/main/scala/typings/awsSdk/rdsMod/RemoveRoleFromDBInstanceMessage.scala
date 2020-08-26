package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveRoleFromDBInstanceMessage extends js.Object {
  /**
    * The name of the DB instance to disassociate the IAM role from.
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example arn:aws:iam::123456789012:role/AccessRole.
    */
  var RoleArn: String = js.native
}

object RemoveRoleFromDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, FeatureName: String, RoleArn: String): RemoveRoleFromDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], FeatureName = FeatureName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRoleFromDBInstanceMessage]
  }
  @scala.inline
  implicit class RemoveRoleFromDBInstanceMessageOps[Self <: RemoveRoleFromDBInstanceMessage] (val x: Self) extends AnyVal {
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
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatureName(value: String): Self = this.set("FeatureName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
  }
  
}

