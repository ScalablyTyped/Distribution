package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Close request; value of command field is "close". Notify the
  * server that the client has closed a previously open file.  If
  * file is still referenced by open files, the server will resume
  * monitoring the filesystem for changes to file.  Server does not
  * currently send a response to a close request.
  */
trait CloseRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_CloseRequest: close
}
object CloseRequest {
  
  inline def apply(arguments: FileRequestArgs, seq: Double): CloseRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "close", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CloseRequest]
  }
  
  extension [Self <: CloseRequest](x: Self) {
    
    inline def setCommand(value: close): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
