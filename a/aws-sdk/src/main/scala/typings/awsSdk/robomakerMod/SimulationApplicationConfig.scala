package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationApplicationConfig extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  /**
    * The version of the simulation application.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
  /**
    * The launch configuration for the simulation application.
    */
  var launchConfig: LaunchConfig = js.native
}

object SimulationApplicationConfig {
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig, applicationVersion: Version = null): SimulationApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationApplicationConfig]
  }
}

