package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.braceCompletion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to get brace completion for a location in the file.
  */
trait BraceCompletionRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_BraceCompletionRequest: BraceCompletionRequestArgs
  
  @JSName("command")
  var command_BraceCompletionRequest: braceCompletion
}
object BraceCompletionRequest {
  
  inline def apply(arguments: BraceCompletionRequestArgs, seq: Double): BraceCompletionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "braceCompletion", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[BraceCompletionRequest]
  }
  
  extension [Self <: BraceCompletionRequest](x: Self) {
    
    inline def setArguments(value: BraceCompletionRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: braceCompletion): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
