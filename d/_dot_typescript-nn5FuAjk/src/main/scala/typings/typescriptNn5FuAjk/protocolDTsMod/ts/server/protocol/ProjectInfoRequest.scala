package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectInfo
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
  var command_ProjectInfoRequest: projectInfo
}
object ProjectInfoRequest {
  
  inline def apply(arguments: ProjectInfoRequestArgs, seq: Double): ProjectInfoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "projectInfo", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ProjectInfoRequest]
  }
  
  extension [Self <: ProjectInfoRequest](x: Self) {
    
    inline def setArguments(value: ProjectInfoRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: projectInfo): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
