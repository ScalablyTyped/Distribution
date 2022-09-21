package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SyntacticDiagnosticsSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Synchronous request for syntactic diagnostics of one file.
  */
trait SyntacticDiagnosticsSyncRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_SyntacticDiagnosticsSyncRequest: SyntacticDiagnosticsSyncRequestArgs
  
  @JSName("command")
  var command_SyntacticDiagnosticsSyncRequest: SyntacticDiagnosticsSync
}
object SyntacticDiagnosticsSyncRequest {
  
  inline def apply(arguments: SyntacticDiagnosticsSyncRequestArgs, command: SyntacticDiagnosticsSync, seq: Double): SyntacticDiagnosticsSyncRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SyntacticDiagnosticsSyncRequest]
  }
  
  extension [Self <: SyntacticDiagnosticsSyncRequest](x: Self) {
    
    inline def setArguments(value: SyntacticDiagnosticsSyncRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: SyntacticDiagnosticsSync): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
