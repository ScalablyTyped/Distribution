package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateEnvironmentOperationsRoleMessage extends js.Object {
  /**
    * The name of the environment to which to set the operations role.
    */
  var EnvironmentName: typings.awsSdk.elasticbeanstalkMod.EnvironmentName = js.native
  /**
    * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's operations role.
    */
  var OperationsRole: typings.awsSdk.elasticbeanstalkMod.OperationsRole = js.native
}

object AssociateEnvironmentOperationsRoleMessage {
  @scala.inline
  def apply(EnvironmentName: EnvironmentName, OperationsRole: OperationsRole): AssociateEnvironmentOperationsRoleMessage = {
    val __obj = js.Dynamic.literal(EnvironmentName = EnvironmentName.asInstanceOf[js.Any], OperationsRole = OperationsRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateEnvironmentOperationsRoleMessage]
  }
}

