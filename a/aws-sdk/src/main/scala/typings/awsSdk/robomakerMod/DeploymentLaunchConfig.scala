package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentLaunchConfig extends StObject {
  
  /**
    * An array of key/value pairs specifying environment variables for the robot application
    */
  var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined
  
  /**
    * The launch file name.
    */
  var launchFile: Command
  
  /**
    * The package name.
    */
  var packageName: Command
  
  /**
    * The deployment post-launch file. This file will be executed after the launch file.
    */
  var postLaunchFile: js.UndefOr[Path] = js.undefined
  
  /**
    * The deployment pre-launch file. This file will be executed prior to the launch file.
    */
  var preLaunchFile: js.UndefOr[Path] = js.undefined
}
object DeploymentLaunchConfig {
  
  inline def apply(launchFile: Command, packageName: Command): DeploymentLaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentLaunchConfig]
  }
  
  extension [Self <: DeploymentLaunchConfig](x: Self) {
    
    inline def setEnvironmentVariables(value: EnvironmentVariableMap): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setLaunchFile(value: Command): Self = StObject.set(x, "launchFile", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: Command): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchFile(value: Path): Self = StObject.set(x, "postLaunchFile", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchFileUndefined: Self = StObject.set(x, "postLaunchFile", js.undefined)
    
    inline def setPreLaunchFile(value: Path): Self = StObject.set(x, "preLaunchFile", value.asInstanceOf[js.Any])
    
    inline def setPreLaunchFileUndefined: Self = StObject.set(x, "preLaunchFile", js.undefined)
  }
}
