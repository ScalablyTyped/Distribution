package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CloseExternalProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to close external project.
  */
trait CloseExternalProjectRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_CloseExternalProjectRequest: CloseExternalProjectRequestArgs
  
  @JSName("command")
  var command_CloseExternalProjectRequest: CloseExternalProject
}
object CloseExternalProjectRequest {
  
  inline def apply(arguments: CloseExternalProjectRequestArgs, command: CloseExternalProject, seq: Double): CloseExternalProjectRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CloseExternalProjectRequest]
  }
  
  extension [Self <: CloseExternalProjectRequest](x: Self) {
    
    inline def setArguments(value: CloseExternalProjectRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: CloseExternalProject): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
