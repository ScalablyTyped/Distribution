package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DeploymentApplicationConfigOps[Self <: DeploymentApplicationConfig] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Arn): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: DeploymentVersion): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfig(value: DeploymentLaunchConfig): Self = this.set("launchConfig", value.asInstanceOf[js.Any])
  }
}
