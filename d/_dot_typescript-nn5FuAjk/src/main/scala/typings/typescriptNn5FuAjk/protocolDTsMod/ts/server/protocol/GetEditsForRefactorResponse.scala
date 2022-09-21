package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEditsForRefactorResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_GetEditsForRefactorResponse: js.UndefOr[RefactorEditInfo] = js.undefined
}
object GetEditsForRefactorResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): GetEditsForRefactorResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[GetEditsForRefactorResponse]
  }
  
  extension [Self <: GetEditsForRefactorResponse](x: Self) {
    
    inline def setBody(value: RefactorEditInfo): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
