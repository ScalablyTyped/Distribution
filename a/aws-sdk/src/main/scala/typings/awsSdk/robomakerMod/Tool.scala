package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tool extends StObject {
  
  /**
    * Command-line arguments for the tool. It must include the tool executable name.
    */
  var command: UnrestrictedCommand
  
  /**
    * Exit behavior determines what happens when your tool quits running. RESTART will cause your tool to be restarted. FAIL will cause your job to exit. The default is RESTART. 
    */
  var exitBehavior: js.UndefOr[ExitBehavior] = js.undefined
  
  /**
    * The name of the tool.
    */
  var name: Name
  
  /**
    * Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is False. 
    */
  var streamOutputToCloudWatch: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Boolean indicating whether a streaming session will be configured for the tool. If True, AWS RoboMaker will configure a connection so you can interact with the tool as it is running in the simulation. It must have a graphical user interface. The default is False. 
    */
  var streamUI: js.UndefOr[BoxedBoolean] = js.undefined
}
object Tool {
  
  inline def apply(command: UnrestrictedCommand, name: Name): Tool = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tool]
  }
  
  extension [Self <: Tool](x: Self) {
    
    inline def setCommand(value: UnrestrictedCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setExitBehavior(value: ExitBehavior): Self = StObject.set(x, "exitBehavior", value.asInstanceOf[js.Any])
    
    inline def setExitBehaviorUndefined: Self = StObject.set(x, "exitBehavior", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStreamOutputToCloudWatch(value: BoxedBoolean): Self = StObject.set(x, "streamOutputToCloudWatch", value.asInstanceOf[js.Any])
    
    inline def setStreamOutputToCloudWatchUndefined: Self = StObject.set(x, "streamOutputToCloudWatch", js.undefined)
    
    inline def setStreamUI(value: BoxedBoolean): Self = StObject.set(x, "streamUI", value.asInstanceOf[js.Any])
    
    inline def setStreamUIUndefined: Self = StObject.set(x, "streamUI", js.undefined)
  }
}
