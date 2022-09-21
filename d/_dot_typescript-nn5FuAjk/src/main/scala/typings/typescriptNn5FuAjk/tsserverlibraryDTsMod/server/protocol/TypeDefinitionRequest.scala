package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.TypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Go to type request; value of command field is
  * "typeDefinition". Return response giving the file locations that
  * define the type for the symbol found in file at location line, col.
  */
trait TypeDefinitionRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_TypeDefinitionRequest: TypeDefinition
}
object TypeDefinitionRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: TypeDefinition, seq: Double): TypeDefinitionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[TypeDefinitionRequest]
  }
  
  extension [Self <: TypeDefinitionRequest](x: Self) {
    
    inline def setCommand(value: TypeDefinition): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
