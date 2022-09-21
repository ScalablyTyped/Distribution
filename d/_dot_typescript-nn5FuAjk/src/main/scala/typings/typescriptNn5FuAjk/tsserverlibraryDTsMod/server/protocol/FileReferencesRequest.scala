package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.FileReferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReferencesRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_FileReferencesRequest: FileReferences
}
object FileReferencesRequest {
  
  inline def apply(arguments: FileRequestArgs, command: FileReferences, seq: Double): FileReferencesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FileReferencesRequest]
  }
  
  extension [Self <: FileReferencesRequest](x: Self) {
    
    inline def setCommand(value: FileReferences): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
