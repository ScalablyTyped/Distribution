package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for "projectInfo" request
  */
trait ProjectInfoResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_ProjectInfoResponse: js.UndefOr[ProjectInfo] = js.undefined
}
object ProjectInfoResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): ProjectInfoResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[ProjectInfoResponse]
  }
  
  extension [Self <: ProjectInfoResponse](x: Self) {
    
    inline def setBody(value: ProjectInfo): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
