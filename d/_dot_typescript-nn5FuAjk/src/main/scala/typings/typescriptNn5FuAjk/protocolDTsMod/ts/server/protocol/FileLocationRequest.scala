package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request whose arguments specify a file location (file, line, col).
  */
trait FileLocationRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_FileLocationRequest: FileLocationRequestArgs
}
object FileLocationRequest {
  
  inline def apply(arguments: FileLocationRequestArgs, command: String, seq: Double): FileLocationRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FileLocationRequest]
  }
  
  extension [Self <: FileLocationRequest](x: Self) {
    
    inline def setArguments(value: FileLocationRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
