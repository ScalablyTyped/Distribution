package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.signatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signature help request; value of command field is "signatureHelp".
  * Given a file location (file, line, col), return the signature
  * help.
  */
trait SignatureHelpRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_SignatureHelpRequest: SignatureHelpRequestArgs
  
  @JSName("command")
  var command_SignatureHelpRequest: signatureHelp
}
object SignatureHelpRequest {
  
  inline def apply(arguments: SignatureHelpRequestArgs, seq: Double): SignatureHelpRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "signatureHelp", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SignatureHelpRequest]
  }
  
  extension [Self <: SignatureHelpRequest](x: Self) {
    
    inline def setArguments(value: SignatureHelpRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: signatureHelp): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
