package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.definition
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
  var command_DefinitionRequest: definition
}
object DefinitionRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): DefinitionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "definition", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[DefinitionRequest]
  }
  
  extension [Self <: DefinitionRequest](x: Self) {
    
    inline def setCommand(value: definition): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
