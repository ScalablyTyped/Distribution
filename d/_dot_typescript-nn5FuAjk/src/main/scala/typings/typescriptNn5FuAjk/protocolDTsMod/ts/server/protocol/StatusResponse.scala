package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to StatusRequest
  */
trait StatusResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_StatusResponse: StatusResponseBody
}
object StatusResponse {
  
  inline def apply(body: StatusResponseBody, command: String, request_seq: Double, seq: Double, success: Boolean): StatusResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[StatusResponse]
  }
  
  extension [Self <: StatusResponse](x: Self) {
    
    inline def setBody(value: StatusResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
