package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.fileReferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReferencesRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_FileReferencesRequest: fileReferences
}
object FileReferencesRequest {
  
  inline def apply(arguments: FileRequestArgs, seq: Double): FileReferencesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "fileReferences", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FileReferencesRequest]
  }
  
  extension [Self <: FileReferencesRequest](x: Self) {
    
    inline def setCommand(value: fileReferences): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
