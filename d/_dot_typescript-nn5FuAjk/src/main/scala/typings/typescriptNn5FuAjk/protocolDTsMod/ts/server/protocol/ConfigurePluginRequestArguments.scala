package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurePluginRequestArguments extends StObject {
  
  var configuration: Any
  
  var pluginName: String
}
object ConfigurePluginRequestArguments {
  
  inline def apply(configuration: Any, pluginName: String): ConfigurePluginRequestArguments = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurePluginRequestArguments]
  }
  
  extension [Self <: ConfigurePluginRequestArguments](x: Self) {
    
    inline def setConfiguration(value: Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
  }
}
