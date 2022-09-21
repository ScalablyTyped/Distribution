package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getCodeFixes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the available codefixes at a specific position.
  */
trait CodeFixRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_CodeFixRequest: CodeFixRequestArgs
  
  @JSName("command")
  var command_CodeFixRequest: getCodeFixes
}
object CodeFixRequest {
  
  inline def apply(arguments: CodeFixRequestArgs, seq: Double): CodeFixRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "getCodeFixes", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CodeFixRequest]
  }
  
  extension [Self <: CodeFixRequest](x: Self) {
    
    inline def setArguments(value: CodeFixRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: getCodeFixes): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
