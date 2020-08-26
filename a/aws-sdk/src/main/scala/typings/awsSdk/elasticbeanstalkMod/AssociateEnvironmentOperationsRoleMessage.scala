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
  @scala.inline
  implicit class AssociateEnvironmentOperationsRoleMessageOps[Self <: AssociateEnvironmentOperationsRoleMessage] (val x: Self) extends AnyVal {
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
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationsRole(value: OperationsRole): Self = this.set("OperationsRole", value.asInstanceOf[js.Any])
  }
  
}

