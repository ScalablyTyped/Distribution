package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfig extends StObject {
  
  /**
    * If you've specified General as the value for your RobotSoftwareSuite, you can use this field to specify a list of commands for your container image. If you've specified SimulationRuntime as the value for your SimulationSoftwareSuite, you can use this field to specify a list of commands for your container image.
    */
  var command: js.UndefOr[CommandList] = js.undefined
  
  /**
    * The environment variables for the application launch.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined
  
  /**
    * The launch file name.
    */
  var launchFile: js.UndefOr[Command] = js.undefined
  
  /**
    * The package name.
    */
  var packageName: js.UndefOr[Command] = js.undefined
  
  /**
    * The port forwarding configuration.
    */
  var portForwardingConfig: js.UndefOr[PortForwardingConfig] = js.undefined
  
  /**
    * Boolean indicating whether a streaming session will be configured for the application. If True, AWS RoboMaker will configure a connection so you can interact with your application as it is running in the simulation. You must configure and launch the component. It must have a graphical user interface. 
    */
  var streamUI: js.UndefOr[Boolean] = js.undefined
}
object LaunchConfig {
  
  inline def apply(): LaunchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfig]
  }
  
  extension [Self <: LaunchConfig](x: Self) {
    
    inline def setCommand(value: CommandList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: NonEmptyString*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnvironmentVariables(value: EnvironmentVariableMap): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setLaunchFile(value: Command): Self = StObject.set(x, "launchFile", value.asInstanceOf[js.Any])
    
    inline def setLaunchFileUndefined: Self = StObject.set(x, "launchFile", js.undefined)
    
    inline def setPackageName(value: Command): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPortForwardingConfig(value: PortForwardingConfig): Self = StObject.set(x, "portForwardingConfig", value.asInstanceOf[js.Any])
    
    inline def setPortForwardingConfigUndefined: Self = StObject.set(x, "portForwardingConfig", js.undefined)
    
    inline def setStreamUI(value: Boolean): Self = StObject.set(x, "streamUI", value.asInstanceOf[js.Any])
    
    inline def setStreamUIUndefined: Self = StObject.set(x, "streamUI", js.undefined)
  }
}
