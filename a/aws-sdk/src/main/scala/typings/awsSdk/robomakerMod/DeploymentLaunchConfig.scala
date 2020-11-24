package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentLaunchConfig extends js.Object {
  
  /**
    * An array of key/value pairs specifying environment variables for the robot application
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
    * The deployment post-launch file. This file will be executed after the launch file.
    */
  var postLaunchFile: js.UndefOr[Path] = js.native
  
  /**
    * The deployment pre-launch file. This file will be executed prior to the launch file.
    */
  var preLaunchFile: js.UndefOr[Path] = js.native
}
object DeploymentLaunchConfig {
  
  @scala.inline
  def apply(launchFile: Command, packageName: Command): DeploymentLaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentLaunchConfig]
  }
  
  @scala.inline
  implicit class DeploymentLaunchConfigOps[Self <: DeploymentLaunchConfig] (val x: Self) extends AnyVal {
    
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
    def setPostLaunchFile(value: Path): Self = this.set("postLaunchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostLaunchFile: Self = this.set("postLaunchFile", js.undefined)
    
    @scala.inline
    def setPreLaunchFile(value: Path): Self = this.set("preLaunchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreLaunchFile: Self = this.set("preLaunchFile", js.undefined)
  }
}
