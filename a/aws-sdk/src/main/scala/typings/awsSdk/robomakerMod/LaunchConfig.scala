package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfig extends js.Object {
  /**
    * The environment variables for the application launch.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.native
  /**
    * The launch file name.
    */
  var launchFile: Command = js.native
  /**
    * The package name.
    */
  var packageName: Command = js.native
  /**
    * The port forwarding configuration.
    */
  var portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.native
  /**
    * Boolean indicating whether a streaming session will be configured for the application. If True, AWS RoboMaker will configure a connection so you can interact with your application as it is running in the simulation. You must configure and luanch the component. It must have a graphical user interface. 
    */
  var streamUI: js.UndefOr[Boolean] = js.native
}

object LaunchConfig {
  @scala.inline
  def apply(
    launchFile: Command,
    packageName: Command,
    environmentVariables: EnvironmentVariableMap = null,
    portForwardingConfig: PortForwardingConfig = null,
    streamUI: js.UndefOr[Boolean] = js.undefined
  ): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (portForwardingConfig != null) __obj.updateDynamic("portForwardingConfig")(portForwardingConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(streamUI)) __obj.updateDynamic("streamUI")(streamUI.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
}

