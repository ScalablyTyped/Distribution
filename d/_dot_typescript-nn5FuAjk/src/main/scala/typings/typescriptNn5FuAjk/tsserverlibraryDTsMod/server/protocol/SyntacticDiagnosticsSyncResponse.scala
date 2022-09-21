package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response object for synchronous syntactic diagnostics request.
  */
trait SyntacticDiagnosticsSyncResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_SyntacticDiagnosticsSyncResponse: js.UndefOr[Array[Diagnostic | DiagnosticWithLinePosition]] = js.undefined
}
object SyntacticDiagnosticsSyncResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): SyntacticDiagnosticsSyncResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[SyntacticDiagnosticsSyncResponse]
  }
  
  extension [Self <: SyntacticDiagnosticsSyncResponse](x: Self) {
    
    inline def setBody(value: Array[Diagnostic | DiagnosticWithLinePosition]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
