package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.typeDefinition
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
  var command_TypeDefinitionRequest: typeDefinition
}
object TypeDefinitionRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): TypeDefinitionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "typeDefinition", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[TypeDefinitionRequest]
  }
  
  extension [Self <: TypeDefinitionRequest](x: Self) {
    
    inline def setCommand(value: typeDefinition): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
