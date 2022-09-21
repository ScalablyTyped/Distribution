package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetCombinedCodeFix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCombinedCodeFixRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GetCombinedCodeFixRequest: GetCombinedCodeFixRequestArgs
  
  @JSName("command")
  var command_GetCombinedCodeFixRequest: GetCombinedCodeFix
}
object GetCombinedCodeFixRequest {
  
  inline def apply(arguments: GetCombinedCodeFixRequestArgs, command: GetCombinedCodeFix, seq: Double): GetCombinedCodeFixRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GetCombinedCodeFixRequest]
  }
  
  extension [Self <: GetCombinedCodeFixRequest](x: Self) {
    
    inline def setArguments(value: GetCombinedCodeFixRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: GetCombinedCodeFix): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
