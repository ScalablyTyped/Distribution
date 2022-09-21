package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SemanticDiagnosticsSync
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
  var command_SemanticDiagnosticsSyncRequest: SemanticDiagnosticsSync
}
object SemanticDiagnosticsSyncRequest {
  
  inline def apply(arguments: SemanticDiagnosticsSyncRequestArgs, command: SemanticDiagnosticsSync, seq: Double): SemanticDiagnosticsSyncRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SemanticDiagnosticsSyncRequest]
  }
  
  extension [Self <: SemanticDiagnosticsSyncRequest](x: Self) {
    
    inline def setArguments(value: SemanticDiagnosticsSyncRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: SemanticDiagnosticsSync): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
