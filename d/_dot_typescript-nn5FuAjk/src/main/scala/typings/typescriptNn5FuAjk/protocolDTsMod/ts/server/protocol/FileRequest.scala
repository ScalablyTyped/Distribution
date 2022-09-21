package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request whose sole parameter is a file name.
  */
trait FileRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_FileRequest: FileRequestArgs
}
object FileRequest {
  
  inline def apply(arguments: FileRequestArgs, command: String, seq: Double): FileRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FileRequest]
  }
  
  extension [Self <: FileRequest](x: Self) {
    
    inline def setArguments(value: FileRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
