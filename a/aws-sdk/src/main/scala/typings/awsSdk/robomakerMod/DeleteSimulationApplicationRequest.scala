package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application to delete.
    */
  var application: Arn = js.native
  /**
    * The version of the simulation application to delete.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}

object DeleteSimulationApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DeleteSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSimulationApplicationRequest]
  }
}

