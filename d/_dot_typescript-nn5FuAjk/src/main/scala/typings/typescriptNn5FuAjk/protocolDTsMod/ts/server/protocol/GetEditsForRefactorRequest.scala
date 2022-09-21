package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getEditsForRefactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEditsForRefactorRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GetEditsForRefactorRequest: GetEditsForRefactorRequestArgs
  
  @JSName("command")
  var command_GetEditsForRefactorRequest: getEditsForRefactor
}
object GetEditsForRefactorRequest {
  
  inline def apply(arguments: GetEditsForRefactorRequestArgs, seq: Double): GetEditsForRefactorRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "getEditsForRefactor", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GetEditsForRefactorRequest]
  }
  
  extension [Self <: GetEditsForRefactorRequest](x: Self) {
    
    inline def setArguments(value: GetEditsForRefactorRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: getEditsForRefactor): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
