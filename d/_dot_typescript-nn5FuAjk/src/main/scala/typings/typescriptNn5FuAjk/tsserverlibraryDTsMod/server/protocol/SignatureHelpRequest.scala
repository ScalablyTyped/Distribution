package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SignatureHelp
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
  var command_SignatureHelpRequest: SignatureHelp
}
object SignatureHelpRequest {
  
  inline def apply(arguments: SignatureHelpRequestArgs, command: SignatureHelp, seq: Double): SignatureHelpRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SignatureHelpRequest]
  }
  
  extension [Self <: SignatureHelpRequest](x: Self) {
    
    inline def setArguments(value: SignatureHelpRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: SignatureHelp): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
