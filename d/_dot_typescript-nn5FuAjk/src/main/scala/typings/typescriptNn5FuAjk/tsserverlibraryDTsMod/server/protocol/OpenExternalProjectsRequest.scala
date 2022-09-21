package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.OpenExternalProjects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to open multiple external projects
  */
trait OpenExternalProjectsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_OpenExternalProjectsRequest: OpenExternalProjectsArgs
  
  @JSName("command")
  var command_OpenExternalProjectsRequest: OpenExternalProjects
}
object OpenExternalProjectsRequest {
  
  inline def apply(arguments: OpenExternalProjectsArgs, command: OpenExternalProjects, seq: Double): OpenExternalProjectsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OpenExternalProjectsRequest]
  }
  
  extension [Self <: OpenExternalProjectsRequest](x: Self) {
    
    inline def setArguments(value: OpenExternalProjectsArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: OpenExternalProjects): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
