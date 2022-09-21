package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionAndBoundSpanResponse
  extends StObject
     with Response {
  
  @JSName("body")
  val body_DefinitionAndBoundSpanResponse: DefinitionInfoAndBoundSpan
}
object DefinitionAndBoundSpanResponse {
  
  inline def apply(
    body: DefinitionInfoAndBoundSpan,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean
  ): DefinitionAndBoundSpanResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[DefinitionAndBoundSpanResponse]
  }
  
  extension [Self <: DefinitionAndBoundSpanResponse](x: Self) {
    
    inline def setBody(value: DefinitionInfoAndBoundSpan): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
