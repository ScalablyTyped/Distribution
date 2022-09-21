package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetCodeFixes
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
  var command_CodeFixRequest: GetCodeFixes
}
object CodeFixRequest {
  
  inline def apply(arguments: CodeFixRequestArgs, command: GetCodeFixes, seq: Double): CodeFixRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CodeFixRequest]
  }
  
  extension [Self <: CodeFixRequest](x: Self) {
    
    inline def setArguments(value: CodeFixRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: GetCodeFixes): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
