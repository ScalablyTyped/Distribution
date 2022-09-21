package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.openExternalProject
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
  var command_OpenExternalProjectRequest: openExternalProject
}
object OpenExternalProjectRequest {
  
  inline def apply(arguments: OpenExternalProjectArgs, seq: Double): OpenExternalProjectRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "openExternalProject", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OpenExternalProjectRequest]
  }
  
  extension [Self <: OpenExternalProjectRequest](x: Self) {
    
    inline def setArguments(value: OpenExternalProjectArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: openExternalProject): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
