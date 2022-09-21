package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.prepareCallHierarchy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepareCallHierarchyRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_PrepareCallHierarchyRequest: prepareCallHierarchy
}
object PrepareCallHierarchyRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): PrepareCallHierarchyRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "prepareCallHierarchy", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[PrepareCallHierarchyRequest]
  }
  
  extension [Self <: PrepareCallHierarchyRequest](x: Self) {
    
    inline def setCommand(value: prepareCallHierarchy): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
