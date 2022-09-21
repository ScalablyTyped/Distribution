package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.DefinitionAndBoundSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionAndBoundSpanRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  val command_DefinitionAndBoundSpanRequest: DefinitionAndBoundSpan
}
object DefinitionAndBoundSpanRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: DefinitionAndBoundSpan, seq: Double): DefinitionAndBoundSpanRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[DefinitionAndBoundSpanRequest]
  }
  
  extension [Self <: DefinitionAndBoundSpanRequest](x: Self) {
    
    inline def setCommand(value: DefinitionAndBoundSpan): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
