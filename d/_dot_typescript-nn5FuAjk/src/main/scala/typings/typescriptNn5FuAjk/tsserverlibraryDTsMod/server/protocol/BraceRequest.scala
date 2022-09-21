package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Brace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Brace matching request; value of command field is "brace".
  * Return response giving the file locations of matching braces
  * found in file at location line, offset.
  */
trait BraceRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_BraceRequest: Brace
}
object BraceRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: Brace, seq: Double): BraceRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[BraceRequest]
  }
  
  extension [Self <: BraceRequest](x: Self) {
    
    inline def setCommand(value: Brace): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
