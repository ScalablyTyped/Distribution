package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Occurrences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  * Get occurrences request; value of command field is
  * "occurrences". Return response giving spans that are relevant
  * in the file at a given line and column.
  */
trait OccurrencesRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_OccurrencesRequest: Occurrences
}
object OccurrencesRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: Occurrences, seq: Double): OccurrencesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OccurrencesRequest]
  }
  
  extension [Self <: OccurrencesRequest](x: Self) {
    
    inline def setCommand(value: Occurrences): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
