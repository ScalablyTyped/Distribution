package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Configure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Configure request; value of command field is "configure".  Specifies
  *  host information, such as host type, tab size, and indent size.
  */
trait ConfigureRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_ConfigureRequest: ConfigureRequestArguments
  
  @JSName("command")
  var command_ConfigureRequest: Configure
}
object ConfigureRequest {
  
  inline def apply(arguments: ConfigureRequestArguments, command: Configure, seq: Double): ConfigureRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ConfigureRequest]
  }
  
  extension [Self <: ConfigureRequest](x: Self) {
    
    inline def setArguments(value: ConfigureRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Configure): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
