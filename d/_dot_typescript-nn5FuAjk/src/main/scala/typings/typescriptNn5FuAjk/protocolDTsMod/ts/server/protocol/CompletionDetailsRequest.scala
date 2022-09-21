package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completionEntryDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Completion entry details request; value of command field is
  * "completionEntryDetails".  Given a file location (file, line,
  * col) and an array of completion entry names return more
  * detailed information for each completion entry.
  */
trait CompletionDetailsRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_CompletionDetailsRequest: CompletionDetailsRequestArgs
  
  @JSName("command")
  var command_CompletionDetailsRequest: completionEntryDetails
}
object CompletionDetailsRequest {
  
  inline def apply(arguments: CompletionDetailsRequestArgs, seq: Double): CompletionDetailsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "completionEntryDetails", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompletionDetailsRequest]
  }
  
  extension [Self <: CompletionDetailsRequest](x: Self) {
    
    inline def setArguments(value: CompletionDetailsRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: completionEntryDetails): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
