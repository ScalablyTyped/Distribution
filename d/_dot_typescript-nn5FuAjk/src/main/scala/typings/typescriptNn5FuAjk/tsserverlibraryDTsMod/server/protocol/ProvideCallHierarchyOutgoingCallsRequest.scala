package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProvideCallHierarchyOutgoingCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideCallHierarchyOutgoingCallsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_ProvideCallHierarchyOutgoingCallsRequest: ProvideCallHierarchyOutgoingCalls
}
object ProvideCallHierarchyOutgoingCallsRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: ProvideCallHierarchyOutgoingCalls, seq: Double): ProvideCallHierarchyOutgoingCallsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ProvideCallHierarchyOutgoingCallsRequest]
  }
  
  extension [Self <: ProvideCallHierarchyOutgoingCallsRequest](x: Self) {
    
    inline def setCommand(value: ProvideCallHierarchyOutgoingCalls): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
