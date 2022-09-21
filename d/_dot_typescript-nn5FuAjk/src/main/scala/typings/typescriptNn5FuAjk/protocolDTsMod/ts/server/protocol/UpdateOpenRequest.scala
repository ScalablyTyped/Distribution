package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.updateOpen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to synchronize list of open files with the client
  */
trait UpdateOpenRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_UpdateOpenRequest: UpdateOpenRequestArgs
  
  @JSName("command")
  var command_UpdateOpenRequest: updateOpen
}
object UpdateOpenRequest {
  
  inline def apply(arguments: UpdateOpenRequestArgs, seq: Double): UpdateOpenRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "updateOpen", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[UpdateOpenRequest]
  }
  
  extension [Self <: UpdateOpenRequest](x: Self) {
    
    inline def setArguments(value: UpdateOpenRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: updateOpen): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
