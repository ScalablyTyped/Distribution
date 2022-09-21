package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.suggestionDiagnosticsSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionDiagnosticsSyncRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_SuggestionDiagnosticsSyncRequest: SuggestionDiagnosticsSyncRequestArgs
  
  @JSName("command")
  var command_SuggestionDiagnosticsSyncRequest: suggestionDiagnosticsSync
}
object SuggestionDiagnosticsSyncRequest {
  
  inline def apply(arguments: SuggestionDiagnosticsSyncRequestArgs, seq: Double): SuggestionDiagnosticsSyncRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "suggestionDiagnosticsSync", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SuggestionDiagnosticsSyncRequest]
  }
  
  extension [Self <: SuggestionDiagnosticsSyncRequest](x: Self) {
    
    inline def setArguments(value: SuggestionDiagnosticsSyncRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: suggestionDiagnosticsSync): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
