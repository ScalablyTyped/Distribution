package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Go to implementation request; value of command field is
  * "implementation". Return response giving the file locations that
  * implement the symbol found in file at location line, col.
  */
trait ImplementationRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_ImplementationRequest: implementation
}
object ImplementationRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): ImplementationRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "implementation", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ImplementationRequest]
  }
  
  extension [Self <: ImplementationRequest](x: Self) {
    
    inline def setCommand(value: implementation): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
