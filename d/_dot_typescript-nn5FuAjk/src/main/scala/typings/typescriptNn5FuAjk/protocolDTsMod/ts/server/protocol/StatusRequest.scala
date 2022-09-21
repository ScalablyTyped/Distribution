package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusRequest
  extends StObject
     with Request {
  
  @JSName("command")
  var command_StatusRequest: status
}
object StatusRequest {
  
  inline def apply(seq: Double): StatusRequest = {
    val __obj = js.Dynamic.literal(command = "status", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[StatusRequest]
  }
  
  extension [Self <: StatusRequest](x: Self) {
    
    inline def setCommand(value: status): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
