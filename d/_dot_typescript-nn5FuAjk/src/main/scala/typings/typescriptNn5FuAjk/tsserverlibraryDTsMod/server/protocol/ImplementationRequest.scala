package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Implementation
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
  var command_ImplementationRequest: Implementation
}
object ImplementationRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: Implementation, seq: Double): ImplementationRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ImplementationRequest]
  }
  
  extension [Self <: ImplementationRequest](x: Self) {
    
    inline def setCommand(value: Implementation): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
