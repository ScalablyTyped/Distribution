package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compileOnSaveEmitFile
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
  var command_CompileOnSaveEmitFileRequest: compileOnSaveEmitFile
}
object CompileOnSaveEmitFileRequest {
  
  inline def apply(arguments: CompileOnSaveEmitFileRequestArgs, seq: Double): CompileOnSaveEmitFileRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "compileOnSaveEmitFile", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompileOnSaveEmitFileRequest]
  }
  
  extension [Self <: CompileOnSaveEmitFileRequest](x: Self) {
    
    inline def setArguments(value: CompileOnSaveEmitFileRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: compileOnSaveEmitFile): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
