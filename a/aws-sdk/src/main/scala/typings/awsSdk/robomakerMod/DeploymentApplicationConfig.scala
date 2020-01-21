package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentApplicationConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn = js.native
  /**
    * The version of the application.
    */
  var applicationVersion: DeploymentVersion = js.native
  /**
    * The launch configuration.
    */
  var launchConfig: DeploymentLaunchConfig = js.native
}

object DeploymentApplicationConfig {
  @scala.inline
  def apply(application: Arn, applicationVersion: DeploymentVersion, launchConfig: DeploymentLaunchConfig): DeploymentApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentApplicationConfig]
  }
}

