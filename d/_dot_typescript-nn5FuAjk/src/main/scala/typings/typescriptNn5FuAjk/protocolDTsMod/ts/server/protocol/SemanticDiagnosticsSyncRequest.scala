package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.semanticDiagnosticsSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Synchronous request for semantic diagnostics of one file.
  */
trait SemanticDiagnosticsSyncRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_SemanticDiagnosticsSyncRequest: SemanticDiagnosticsSyncRequestArgs
  
  @JSName("command")
  var command_SemanticDiagnosticsSyncRequest: semanticDiagnosticsSync
}
object SemanticDiagnosticsSyncRequest {
  
  inline def apply(arguments: SemanticDiagnosticsSyncRequestArgs, seq: Double): SemanticDiagnosticsSyncRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "semanticDiagnosticsSync", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SemanticDiagnosticsSyncRequest]
  }
  
  extension [Self <: SemanticDiagnosticsSyncRequest](x: Self) {
    
    inline def setArguments(value: SemanticDiagnosticsSyncRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: semanticDiagnosticsSync): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
