package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TextInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxClosingTagResponse
  extends StObject
     with Response {
  
  @JSName("body")
  val body_JsxClosingTagResponse: TextInsertion
}
object JsxClosingTagResponse {
  
  inline def apply(body: TextInsertion, command: String, request_seq: Double, seq: Double, success: Boolean): JsxClosingTagResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[JsxClosingTagResponse]
  }
  
  extension [Self <: JsxClosingTagResponse](x: Self) {
    
    inline def setBody(value: TextInsertion): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
