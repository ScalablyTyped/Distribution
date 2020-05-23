package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationMessage extends js.Object {
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * When set to true, running environments will be terminated before deleting the application.
    */
  var TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.native
}

object DeleteApplicationMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
  ): DeleteApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (!js.isUndefined(TerminateEnvByForce)) __obj.updateDynamic("TerminateEnvByForce")(TerminateEnvByForce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationMessage]
  }
}

