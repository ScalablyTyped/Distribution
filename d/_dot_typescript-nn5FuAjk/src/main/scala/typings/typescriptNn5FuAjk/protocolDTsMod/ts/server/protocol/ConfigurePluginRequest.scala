package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configurePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurePluginRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_ConfigurePluginRequest: ConfigurePluginRequestArguments
  
  @JSName("command")
  var command_ConfigurePluginRequest: configurePlugin
}
object ConfigurePluginRequest {
  
  inline def apply(arguments: ConfigurePluginRequestArguments, seq: Double): ConfigurePluginRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "configurePlugin", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ConfigurePluginRequest]
  }
  
  extension [Self <: ConfigurePluginRequest](x: Self) {
    
    inline def setArguments(value: ConfigurePluginRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: configurePlugin): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
