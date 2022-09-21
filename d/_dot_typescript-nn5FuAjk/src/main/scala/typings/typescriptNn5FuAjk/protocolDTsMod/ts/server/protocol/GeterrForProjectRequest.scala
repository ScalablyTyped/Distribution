package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.geterrForProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GeterrForProjectRequest request; value of command field is
  * "geterrForProject". It works similarly with 'Geterr', only
  * it request for every file in this project.
  */
trait GeterrForProjectRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GeterrForProjectRequest: GeterrForProjectRequestArgs
  
  @JSName("command")
  var command_GeterrForProjectRequest: geterrForProject
}
object GeterrForProjectRequest {
  
  inline def apply(arguments: GeterrForProjectRequestArgs, seq: Double): GeterrForProjectRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "geterrForProject", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GeterrForProjectRequest]
  }
  
  extension [Self <: GeterrForProjectRequest](x: Self) {
    
    inline def setArguments(value: GeterrForProjectRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: geterrForProject): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
