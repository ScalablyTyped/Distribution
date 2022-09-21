package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionInfoAndBoundSpanResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_DefinitionInfoAndBoundSpanResponse: js.UndefOr[DefinitionInfoAndBoundSpan] = js.undefined
}
object DefinitionInfoAndBoundSpanResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): DefinitionInfoAndBoundSpanResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[DefinitionInfoAndBoundSpanResponse]
  }
  
  extension [Self <: DefinitionInfoAndBoundSpanResponse](x: Self) {
    
    inline def setBody(value: DefinitionInfoAndBoundSpan): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
