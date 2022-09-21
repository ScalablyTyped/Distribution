package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.organizeImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Organize imports by:
  *   1) Removing unused imports
  *   2) Coalescing imports from the same module
  *   3) Sorting imports
  */
trait OrganizeImportsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_OrganizeImportsRequest: OrganizeImportsRequestArgs
  
  @JSName("command")
  var command_OrganizeImportsRequest: organizeImports
}
object OrganizeImportsRequest {
  
  inline def apply(arguments: OrganizeImportsRequestArgs, seq: Double): OrganizeImportsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "organizeImports", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OrganizeImportsRequest]
  }
  
  extension [Self <: OrganizeImportsRequest](x: Self) {
    
    inline def setArguments(value: OrganizeImportsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: organizeImports): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
