package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideCallHierarchyOutgoingCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideCallHierarchyOutgoingCallsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_ProvideCallHierarchyOutgoingCallsRequest: provideCallHierarchyOutgoingCalls
}
object ProvideCallHierarchyOutgoingCallsRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): ProvideCallHierarchyOutgoingCallsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "provideCallHierarchyOutgoingCalls", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ProvideCallHierarchyOutgoingCallsRequest]
  }
  
  extension [Self <: ProvideCallHierarchyOutgoingCallsRequest](x: Self) {
    
    inline def setCommand(value: provideCallHierarchyOutgoingCalls): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
