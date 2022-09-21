package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideInlayHints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_InlayHintsRequest: InlayHintsRequestArgs
  
  @JSName("command")
  var command_InlayHintsRequest: provideInlayHints
}
object InlayHintsRequest {
  
  inline def apply(arguments: InlayHintsRequestArgs, seq: Double): InlayHintsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "provideInlayHints", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[InlayHintsRequest]
  }
  
  extension [Self <: InlayHintsRequest](x: Self) {
    
    inline def setArguments(value: InlayHintsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: provideInlayHints): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
