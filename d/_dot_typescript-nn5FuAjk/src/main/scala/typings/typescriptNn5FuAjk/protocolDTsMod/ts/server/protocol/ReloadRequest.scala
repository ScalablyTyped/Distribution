package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.reload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reload request message; value of command field is "reload".
  * Reload contents of file with name given by the 'file' argument
  * from temporary file with name given by the 'tmpfile' argument.
  * The two names can be identical.
  */
trait ReloadRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_ReloadRequest: ReloadRequestArgs
  
  @JSName("command")
  var command_ReloadRequest: reload
}
object ReloadRequest {
  
  inline def apply(arguments: ReloadRequestArgs, seq: Double): ReloadRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "reload", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ReloadRequest]
  }
  
  extension [Self <: ReloadRequest](x: Self) {
    
    inline def setArguments(value: ReloadRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: reload): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
