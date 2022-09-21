package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Go to definition request; value of command field is
  * "definition". Return response giving the file locations that
  * define the symbol found in file at location line, col.
  */
trait DefinitionRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_DefinitionRequest: Definition
}
object DefinitionRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: Definition, seq: Double): DefinitionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[DefinitionRequest]
  }
  
  extension [Self <: DefinitionRequest](x: Self) {
    
    inline def setCommand(value: Definition): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
