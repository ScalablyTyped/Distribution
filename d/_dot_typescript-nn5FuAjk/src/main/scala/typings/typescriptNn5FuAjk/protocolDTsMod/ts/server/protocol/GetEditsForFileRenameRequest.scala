package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getEditsForFileRename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEditsForFileRenameRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GetEditsForFileRenameRequest: GetEditsForFileRenameRequestArgs
  
  @JSName("command")
  var command_GetEditsForFileRenameRequest: getEditsForFileRename
}
object GetEditsForFileRenameRequest {
  
  inline def apply(arguments: GetEditsForFileRenameRequestArgs, seq: Double): GetEditsForFileRenameRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "getEditsForFileRename", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GetEditsForFileRenameRequest]
  }
  
  extension [Self <: GetEditsForFileRenameRequest](x: Self) {
    
    inline def setArguments(value: GetEditsForFileRenameRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: getEditsForFileRename): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
