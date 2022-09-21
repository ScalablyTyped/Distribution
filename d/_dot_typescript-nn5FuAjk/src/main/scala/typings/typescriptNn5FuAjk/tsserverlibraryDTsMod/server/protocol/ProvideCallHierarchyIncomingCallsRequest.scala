package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProvideCallHierarchyIncomingCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideCallHierarchyIncomingCallsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_ProvideCallHierarchyIncomingCallsRequest: ProvideCallHierarchyIncomingCalls
}
object ProvideCallHierarchyIncomingCallsRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: ProvideCallHierarchyIncomingCalls, seq: Double): ProvideCallHierarchyIncomingCallsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ProvideCallHierarchyIncomingCallsRequest]
  }
  
  extension [Self <: ProvideCallHierarchyIncomingCallsRequest](x: Self) {
    
    inline def setCommand(value: ProvideCallHierarchyIncomingCalls): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
