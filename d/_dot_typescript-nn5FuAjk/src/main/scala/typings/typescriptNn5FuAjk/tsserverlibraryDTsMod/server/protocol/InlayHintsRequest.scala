package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProvideInlayHints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_InlayHintsRequest: InlayHintsRequestArgs
  
  @JSName("command")
  var command_InlayHintsRequest: ProvideInlayHints
}
object InlayHintsRequest {
  
  inline def apply(arguments: InlayHintsRequestArgs, command: ProvideInlayHints, seq: Double): InlayHintsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[InlayHintsRequest]
  }
  
  extension [Self <: InlayHintsRequest](x: Self) {
    
    inline def setArguments(value: InlayHintsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: ProvideInlayHints): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
