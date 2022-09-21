package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getCombinedCodeFix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCombinedCodeFixRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GetCombinedCodeFixRequest: GetCombinedCodeFixRequestArgs
  
  @JSName("command")
  var command_GetCombinedCodeFixRequest: getCombinedCodeFix
}
object GetCombinedCodeFixRequest {
  
  inline def apply(arguments: GetCombinedCodeFixRequestArgs, seq: Double): GetCombinedCodeFixRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "getCombinedCodeFix", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GetCombinedCodeFixRequest]
  }
  
  extension [Self <: GetCombinedCodeFixRequest](x: Self) {
    
    inline def setArguments(value: GetCombinedCodeFixRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: getCombinedCodeFix): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
