package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Reload
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
  var command_ReloadRequest: Reload
}
object ReloadRequest {
  
  inline def apply(arguments: ReloadRequestArgs, command: Reload, seq: Double): ReloadRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ReloadRequest]
  }
  
  extension [Self <: ReloadRequest](x: Self) {
    
    inline def setArguments(value: ReloadRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Reload): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
