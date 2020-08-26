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
  def apply(launchFile: Command, packageName: Command): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
  @scala.inline
  implicit class LaunchConfigOps[Self <: LaunchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLaunchFile(value: Command): Self = this.set("launchFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageName(value: Command): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariableMap): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    @scala.inline
    def setPortForwardingConfig(value: PortForwardingConfig): Self = this.set("portForwardingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortForwardingConfig: Self = this.set("portForwardingConfig", js.undefined)
    @scala.inline
    def setStreamUI(value: Boolean): Self = this.set("streamUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamUI: Self = this.set("streamUI", js.undefined)
  }
  
}

