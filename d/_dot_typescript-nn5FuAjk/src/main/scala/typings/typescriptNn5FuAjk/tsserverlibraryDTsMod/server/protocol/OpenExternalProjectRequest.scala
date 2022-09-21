package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.OpenExternalProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to open or update external project
  */
trait OpenExternalProjectRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_OpenExternalProjectRequest: OpenExternalProjectArgs
  
  @JSName("command")
  var command_OpenExternalProjectRequest: OpenExternalProject
}
object OpenExternalProjectRequest {
  
  inline def apply(arguments: OpenExternalProjectArgs, command: OpenExternalProject, seq: Double): OpenExternalProjectRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OpenExternalProjectRequest]
  }
  
  extension [Self <: OpenExternalProjectRequest](x: Self) {
    
    inline def setArguments(value: OpenExternalProjectArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: OpenExternalProject): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
