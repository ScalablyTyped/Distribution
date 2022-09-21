package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Quickinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Quickinfo request; value of command field is
  * "quickinfo". Return response giving a quick type and
  * documentation string for the symbol found in file at location
  * line, col.
  */
trait QuickInfoRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("command")
  var command_QuickInfoRequest: Quickinfo
}
object QuickInfoRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: Quickinfo, seq: Double): QuickInfoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[QuickInfoRequest]
  }
  
  extension [Self <: QuickInfoRequest](x: Self) {
    
    inline def setCommand(value: Quickinfo): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
