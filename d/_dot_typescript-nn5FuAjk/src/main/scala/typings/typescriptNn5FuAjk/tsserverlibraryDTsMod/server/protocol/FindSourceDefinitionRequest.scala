package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.FindSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindSourceDefinitionRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  val command_FindSourceDefinitionRequest: FindSourceDefinition
}
object FindSourceDefinitionRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: FindSourceDefinition, seq: Double): FindSourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FindSourceDefinitionRequest]
  }
  
  extension [Self <: FindSourceDefinitionRequest](x: Self) {
    
    inline def setCommand(value: FindSourceDefinition): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
