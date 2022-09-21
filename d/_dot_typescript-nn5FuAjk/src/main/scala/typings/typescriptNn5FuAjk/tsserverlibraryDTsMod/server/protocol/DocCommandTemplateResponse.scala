package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TextInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to DocCommentTemplateRequest
  */
trait DocCommandTemplateResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_DocCommandTemplateResponse: js.UndefOr[TextInsertion] = js.undefined
}
object DocCommandTemplateResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): DocCommandTemplateResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[DocCommandTemplateResponse]
  }
  
  extension [Self <: DocCommandTemplateResponse](x: Self) {
    
    inline def setBody(value: TextInsertion): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
