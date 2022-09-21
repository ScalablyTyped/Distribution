package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.brace
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
  var command_BraceRequest: brace
}
object BraceRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, seq: Double): BraceRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "brace", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[BraceRequest]
  }
  
  extension [Self <: BraceRequest](x: Self) {
    
    inline def setCommand(value: brace): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
