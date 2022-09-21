package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.References
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Find references request; value of command field is
  * "references". Return response giving the file locations that
  * reference the symbol found in file at location line, col.
  */
trait ReferencesRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_ReferencesRequest: References
}
object ReferencesRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: References, seq: Double): ReferencesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ReferencesRequest]
  }
  
  extension [Self <: ReferencesRequest](x: Self) {
    
    inline def setCommand(value: References): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
