package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavTreeResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_NavTreeResponse: js.UndefOr[NavigationTree] = js.undefined
}
object NavTreeResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): NavTreeResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[NavTreeResponse]
  }
  
  extension [Self <: NavTreeResponse](x: Self) {
    
    inline def setBody(value: NavigationTree): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
