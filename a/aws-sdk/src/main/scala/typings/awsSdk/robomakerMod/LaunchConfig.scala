package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfig extends StObject {
  
  /**
    * The environment variables for the application launch.
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
    * The port forwarding configuration.
    */
  var portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.undefined
  
  /**
    * Boolean indicating whether a streaming session will be configured for the application. If True, AWS RoboMaker will configure a connection so you can interact with your application as it is running in the simulation. You must configure and luanch the component. It must have a graphical user interface. 
    */
  var streamUI: js.UndefOr[Boolean] = js.undefined
}
object LaunchConfig {
  
  inline def apply(launchFile: Command, packageName: Command): LaunchConfig = {
    val __obj = js.Dynamic.literal(launchFile = launchFile.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
  
  extension [Self <: LaunchConfig](x: Self) {
    
    inline def setEnvironmentVariables(value: EnvironmentVariableMap): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setLaunchFile(value: Command): Self = StObject.set(x, "launchFile", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: Command): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPortForwardingConfig(value: PortForwardingConfig): Self = StObject.set(x, "portForwardingConfig", value.asInstanceOf[js.Any])
    
    inline def setPortForwardingConfigUndefined: Self = StObject.set(x, "portForwardingConfig", js.undefined)
    
    inline def setStreamUI(value: Boolean): Self = StObject.set(x, "streamUI", value.asInstanceOf[js.Any])
    
    inline def setStreamUIUndefined: Self = StObject.set(x, "streamUI", js.undefined)
  }
}
