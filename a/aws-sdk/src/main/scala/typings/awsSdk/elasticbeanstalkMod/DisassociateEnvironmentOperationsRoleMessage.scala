package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateEnvironmentOperationsRoleMessage extends js.Object {
  /**
    * The name of the environment from which to disassociate the operations role.
    */
  var EnvironmentName: typings.awsSdk.elasticbeanstalkMod.EnvironmentName = js.native
}

object DisassociateEnvironmentOperationsRoleMessage {
  @scala.inline
  def apply(EnvironmentName: EnvironmentName): DisassociateEnvironmentOperationsRoleMessage = {
    val __obj = js.Dynamic.literal(EnvironmentName = EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateEnvironmentOperationsRoleMessage]
  }
}

