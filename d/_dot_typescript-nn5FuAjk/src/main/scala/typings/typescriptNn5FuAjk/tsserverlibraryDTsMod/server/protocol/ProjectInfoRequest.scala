package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get the project information of the current file.
  */
trait ProjectInfoRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_ProjectInfoRequest: ProjectInfoRequestArgs
  
  @JSName("command")
  var command_ProjectInfoRequest: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProjectInfo
}
object ProjectInfoRequest {
  
  inline def apply(
    arguments: ProjectInfoRequestArgs,
    command: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProjectInfo,
    seq: Double
  ): ProjectInfoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ProjectInfoRequest]
  }
  
  extension [Self <: ProjectInfoRequest](x: Self) {
    
    inline def setArguments(value: ProjectInfoRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProjectInfo): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
