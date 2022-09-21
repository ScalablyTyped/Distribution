package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.geterr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Geterr request; value of command field is "geterr". Wait for
  * delay milliseconds and then, if during the wait no change or
  * reload messages have arrived for the first file in the files
  * list, get the syntactic errors for the file, field requests,
  * and then get the semantic errors for the file.  Repeat with a
  * smaller delay for each subsequent file on the files list.  Best
  * practice for an editor is to send a file list containing each
  * file that is currently visible, in most-recently-used order.
  */
trait GeterrRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_GeterrRequest: GeterrRequestArgs
  
  @JSName("command")
  var command_GeterrRequest: geterr
}
object GeterrRequest {
  
  inline def apply(arguments: GeterrRequestArgs, seq: Double): GeterrRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "geterr", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[GeterrRequest]
  }
  
  extension [Self <: GeterrRequest](x: Self) {
    
    inline def setArguments(value: GeterrRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: geterr): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
