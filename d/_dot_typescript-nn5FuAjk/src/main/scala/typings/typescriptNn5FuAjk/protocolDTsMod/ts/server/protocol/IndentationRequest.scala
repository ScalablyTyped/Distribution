package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.indentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get indentation for a location in file
  */
trait IndentationRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_IndentationRequest: IndentationRequestArgs
  
  @JSName("command")
  var command_IndentationRequest: indentation
}
object IndentationRequest {
  
  inline def apply(arguments: IndentationRequestArgs, seq: Double): IndentationRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "indentation", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[IndentationRequest]
  }
  
  extension [Self <: IndentationRequest](x: Self) {
    
    inline def setArguments(value: IndentationRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: indentation): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
