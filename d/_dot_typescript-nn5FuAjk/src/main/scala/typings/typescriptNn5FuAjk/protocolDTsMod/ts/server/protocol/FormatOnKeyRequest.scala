package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.formatonkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Format on key request; value of command field is
  * "formatonkey". Given file location and key typed (as string),
  * return response giving zero or more edit instructions.  The
  * edit instructions will be sorted in file order.  Applying the
  * edit instructions in reverse to file will result in correctly
  * reformatted text.
  */
trait FormatOnKeyRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_FormatOnKeyRequest: FormatOnKeyRequestArgs
  
  @JSName("command")
  var command_FormatOnKeyRequest: formatonkey
}
object FormatOnKeyRequest {
  
  inline def apply(arguments: FormatOnKeyRequestArgs, seq: Double): FormatOnKeyRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "formatonkey", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FormatOnKeyRequest]
  }
  
  extension [Self <: FormatOnKeyRequest](x: Self) {
    
    inline def setArguments(value: FormatOnKeyRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: formatonkey): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
