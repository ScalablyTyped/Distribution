package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizeImportsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_OrganizeImportsResponse: Array[FileCodeEdits]
}
object OrganizeImportsResponse {
  
  inline def apply(body: Array[FileCodeEdits], command: String, request_seq: Double, seq: Double, success: Boolean): OrganizeImportsResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[OrganizeImportsResponse]
  }
  
  extension [Self <: OrganizeImportsResponse](x: Self) {
    
    inline def setBody(value: Array[FileCodeEdits]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
