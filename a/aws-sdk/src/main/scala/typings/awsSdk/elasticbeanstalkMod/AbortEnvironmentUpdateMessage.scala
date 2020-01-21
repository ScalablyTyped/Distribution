package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortEnvironmentUpdateMessage extends js.Object {
  /**
    * This specifies the ID of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * This specifies the name of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
}

object AbortEnvironmentUpdateMessage {
  @scala.inline
  def apply(EnvironmentId: EnvironmentId = null, EnvironmentName: EnvironmentName = null): AbortEnvironmentUpdateMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortEnvironmentUpdateMessage]
  }
}

