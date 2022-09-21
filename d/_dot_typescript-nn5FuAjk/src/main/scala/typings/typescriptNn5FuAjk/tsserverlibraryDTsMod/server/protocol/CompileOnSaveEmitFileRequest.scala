package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompileOnSaveEmitFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to recompile the file. All generated outputs (.js, .d.ts or .js.map files) is written on disk.
  */
trait CompileOnSaveEmitFileRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_CompileOnSaveEmitFileRequest: CompileOnSaveEmitFileRequestArgs
  
  @JSName("command")
  var command_CompileOnSaveEmitFileRequest: CompileOnSaveEmitFile
}
object CompileOnSaveEmitFileRequest {
  
  inline def apply(arguments: CompileOnSaveEmitFileRequestArgs, command: CompileOnSaveEmitFile, seq: Double): CompileOnSaveEmitFileRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompileOnSaveEmitFileRequest]
  }
  
  extension [Self <: CompileOnSaveEmitFileRequest](x: Self) {
    
    inline def setArguments(value: CompileOnSaveEmitFileRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: CompileOnSaveEmitFile): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
