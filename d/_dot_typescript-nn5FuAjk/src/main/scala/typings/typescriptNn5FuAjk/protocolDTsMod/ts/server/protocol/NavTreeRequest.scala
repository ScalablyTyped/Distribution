package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navtree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NavTree request; value of command field is "navtree".
  * Return response giving the navigation tree of the requested file.
  */
trait NavTreeRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_NavTreeRequest: navtree
}
object NavTreeRequest {
  
  inline def apply(arguments: FileRequestArgs, seq: Double): NavTreeRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "navtree", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[NavTreeRequest]
  }
  
  extension [Self <: NavTreeRequest](x: Self) {
    
    inline def setCommand(value: navtree): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
