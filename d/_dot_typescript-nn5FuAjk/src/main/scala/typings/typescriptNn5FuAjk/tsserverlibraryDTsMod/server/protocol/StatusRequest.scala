package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusRequest
  extends StObject
     with Request {
  
  @JSName("command")
  var command_StatusRequest: Status
}
object StatusRequest {
  
  inline def apply(command: Status, seq: Double): StatusRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[StatusRequest]
  }
  
  extension [Self <: StatusRequest](x: Self) {
    
    inline def setCommand(value: Status): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
