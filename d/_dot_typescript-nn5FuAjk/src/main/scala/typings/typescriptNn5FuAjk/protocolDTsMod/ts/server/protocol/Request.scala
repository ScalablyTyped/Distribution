package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client-initiated request message
  */
trait Request
  extends StObject
     with Message {
  
  /**
    * Object containing arguments for the command
    */
  var arguments: js.UndefOr[Any] = js.undefined
  
  /**
    * The command to execute
    */
  var command: String
  
  @JSName("type")
  var type_Request: request
}
object Request {
  
  inline def apply(command: String, seq: Double): Request = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setArguments(value: Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setType(value: request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
