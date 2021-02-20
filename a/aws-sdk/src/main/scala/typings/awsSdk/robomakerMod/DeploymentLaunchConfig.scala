package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentLaunchConfig extends StObject {
  
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
  implicit class DeploymentLaunchConfigMutableBuilder[Self <: DeploymentLaunchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariableMap): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setLaunchFile(value: Command): Self = StObject.set(x, "launchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageName(value: Command): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostLaunchFile(value: Path): Self = StObject.set(x, "postLaunchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostLaunchFileUndefined: Self = StObject.set(x, "postLaunchFile", js.undefined)
    
    @scala.inline
    def setPreLaunchFile(value: Path): Self = StObject.set(x, "preLaunchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreLaunchFileUndefined: Self = StObject.set(x, "preLaunchFile", js.undefined)
  }
}
