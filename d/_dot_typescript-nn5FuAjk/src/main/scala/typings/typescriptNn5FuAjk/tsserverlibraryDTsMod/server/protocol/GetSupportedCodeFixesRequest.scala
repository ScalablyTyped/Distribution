package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetSupportedCodeFixes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get codes of supported code fixes.
  */
trait GetSupportedCodeFixesRequest
  extends StObject
     with Request {
  
  @JSName("command")
  var command_GetSupportedCodeFixesRequest: GetSupportedCodeFixes
}
object GetSupportedCodeFixesRequest {
  
  inline def apply(command: GetSupportedCodeFixes, seq: Double): GetSupportedCodeFixesRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GetSupportedCodeFixesRequest]
  }
  
  extension [Self <: GetSupportedCodeFixesRequest](x: Self) {
    
    inline def setCommand(value: GetSupportedCodeFixes): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
