package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetApplicableRefactors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request refactorings at a given position or selection area.
  */
trait GetApplicableRefactorsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GetApplicableRefactorsRequest: GetApplicableRefactorsRequestArgs
  
  @JSName("command")
  var command_GetApplicableRefactorsRequest: GetApplicableRefactors
}
object GetApplicableRefactorsRequest {
  
  inline def apply(arguments: GetApplicableRefactorsRequestArgs, command: GetApplicableRefactors, seq: Double): GetApplicableRefactorsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GetApplicableRefactorsRequest]
  }
  
  extension [Self <: GetApplicableRefactorsRequest](x: Self) {
    
    inline def setArguments(value: GetApplicableRefactorsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: GetApplicableRefactors): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
