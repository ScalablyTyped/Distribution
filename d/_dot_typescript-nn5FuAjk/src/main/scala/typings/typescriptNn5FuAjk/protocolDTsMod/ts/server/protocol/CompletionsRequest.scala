package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completionInfo
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Completions request; value of command field is "completions".
  * Given a file location (file, line, col) and a prefix (which may
  * be the empty string), return the possible completions that
  * begin with prefix.
  */
trait CompletionsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_CompletionsRequest: CompletionsRequestArgs
  
  @JSName("command")
  var command_CompletionsRequest: completions | completionInfo
}
object CompletionsRequest {
  
  inline def apply(arguments: CompletionsRequestArgs, command: completions | completionInfo, seq: Double): CompletionsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompletionsRequest]
  }
  
  extension [Self <: CompletionsRequest](x: Self) {
    
    inline def setArguments(value: CompletionsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: completions | completionInfo): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
