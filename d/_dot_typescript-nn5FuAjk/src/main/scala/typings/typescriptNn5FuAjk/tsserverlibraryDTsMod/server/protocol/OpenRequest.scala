package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Open request; value of command field is "open". Notify the
  * server that the client has file open.  The server will not
  * monitor the filesystem for changes in this file and will assume
  * that the client is updating the server (using the change and/or
  * reload messages) when the file changes. Server does not currently
  * send a response to an open request.
  */
trait OpenRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_OpenRequest: OpenRequestArgs
  
  @JSName("command")
  var command_OpenRequest: Open
}
object OpenRequest {
  
  inline def apply(arguments: OpenRequestArgs, command: Open, seq: Double): OpenRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[OpenRequest]
  }
  
  extension [Self <: OpenRequest](x: Self) {
    
    inline def setArguments(value: OpenRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Open): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
