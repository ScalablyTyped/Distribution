package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rename response message.
  */
trait RenameResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_RenameResponse: js.UndefOr[RenameResponseBody] = js.undefined
}
object RenameResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): RenameResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[RenameResponse]
  }
  
  extension [Self <: RenameResponse](x: Self) {
    
    inline def setBody(value: RenameResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
