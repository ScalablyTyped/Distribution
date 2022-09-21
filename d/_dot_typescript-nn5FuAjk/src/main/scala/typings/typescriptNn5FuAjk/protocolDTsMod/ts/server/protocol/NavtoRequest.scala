package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navto request message; value of command field is "navto".
  * Return list of objects giving file locations and symbols that
  * match the search term given in argument 'searchTerm'.  The
  * context for the search is given by the named file.
  */
trait NavtoRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_NavtoRequest: NavtoRequestArgs
  
  @JSName("command")
  var command_NavtoRequest: navto
}
object NavtoRequest {
  
  inline def apply(arguments: NavtoRequestArgs, seq: Double): NavtoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "navto", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[NavtoRequest]
  }
  
  extension [Self <: NavtoRequest](x: Self) {
    
    inline def setArguments(value: NavtoRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: navto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
