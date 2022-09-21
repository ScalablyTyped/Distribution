package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideCallHierarchyIncomingCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideCallHierarchyIncomingCallsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_ProvideCallHierarchyIncomingCallsRequest: provideCallHierarchyIncomingCalls
}
object ProvideCallHierarchyIncomingCallsRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): ProvideCallHierarchyIncomingCallsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "provideCallHierarchyIncomingCalls", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ProvideCallHierarchyIncomingCallsRequest]
  }
  
  extension [Self <: ProvideCallHierarchyIncomingCallsRequest](x: Self) {
    
    inline def setCommand(value: provideCallHierarchyIncomingCalls): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
