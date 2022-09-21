package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileOnSaveEmitFileResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_CompileOnSaveEmitFileResponse: Boolean | EmitResult
}
object CompileOnSaveEmitFileResponse {
  
  inline def apply(body: Boolean | EmitResult, command: String, request_seq: Double, seq: Double, success: Boolean): CompileOnSaveEmitFileResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[CompileOnSaveEmitFileResponse]
  }
  
  extension [Self <: CompileOnSaveEmitFileResponse](x: Self) {
    
    inline def setBody(value: Boolean | EmitResult): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
