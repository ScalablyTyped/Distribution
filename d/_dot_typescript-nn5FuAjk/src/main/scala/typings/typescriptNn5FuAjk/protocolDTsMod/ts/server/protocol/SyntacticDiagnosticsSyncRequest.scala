package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.syntacticDiagnosticsSync
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
  var command_SyntacticDiagnosticsSyncRequest: syntacticDiagnosticsSync
}
object SyntacticDiagnosticsSyncRequest {
  
  inline def apply(arguments: SyntacticDiagnosticsSyncRequestArgs, seq: Double): SyntacticDiagnosticsSyncRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "syntacticDiagnosticsSync", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SyntacticDiagnosticsSyncRequest]
  }
  
  extension [Self <: SyntacticDiagnosticsSyncRequest](x: Self) {
    
    inline def setArguments(value: SyntacticDiagnosticsSyncRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: syntacticDiagnosticsSync): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
