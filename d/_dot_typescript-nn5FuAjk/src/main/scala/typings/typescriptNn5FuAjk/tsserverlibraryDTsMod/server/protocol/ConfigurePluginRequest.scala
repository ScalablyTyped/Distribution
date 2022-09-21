package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ConfigurePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurePluginRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_ConfigurePluginRequest: ConfigurePluginRequestArguments
  
  @JSName("command")
  var command_ConfigurePluginRequest: ConfigurePlugin
}
object ConfigurePluginRequest {
  
  inline def apply(arguments: ConfigurePluginRequestArguments, command: ConfigurePlugin, seq: Double): ConfigurePluginRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ConfigurePluginRequest]
  }
  
  extension [Self <: ConfigurePluginRequest](x: Self) {
    
    inline def setArguments(value: ConfigurePluginRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: ConfigurePlugin): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
