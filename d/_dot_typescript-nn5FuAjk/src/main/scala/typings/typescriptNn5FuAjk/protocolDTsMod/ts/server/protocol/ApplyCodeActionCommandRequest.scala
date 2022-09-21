package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.applyCodeActionCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyCodeActionCommandRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_ApplyCodeActionCommandRequest: ApplyCodeActionCommandRequestArgs
  
  @JSName("command")
  var command_ApplyCodeActionCommandRequest: applyCodeActionCommand
}
object ApplyCodeActionCommandRequest {
  
  inline def apply(arguments: ApplyCodeActionCommandRequestArgs, seq: Double): ApplyCodeActionCommandRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "applyCodeActionCommand", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ApplyCodeActionCommandRequest]
  }
  
  extension [Self <: ApplyCodeActionCommandRequest](x: Self) {
    
    inline def setArguments(value: ApplyCodeActionCommandRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: applyCodeActionCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
