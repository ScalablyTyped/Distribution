package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterRdsDbInstanceRequest extends js.Object {
  /**
    * The database password.
    */
  var DbPassword: String = js.native
  /**
    * The database's master user name.
    */
  var DbUser: String = js.native
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object RegisterRdsDbInstanceRequest {
  @scala.inline
  def apply(DbPassword: String, DbUser: String, RdsDbInstanceArn: String, StackId: String): RegisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(DbPassword = DbPassword.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any], RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
  }
}

