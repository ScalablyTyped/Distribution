package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compileOnSaveAffectedFileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to obtain the list of files that should be regenerated if target file is recompiled.
  * NOTE: this us query-only operation and does not generate any output on disk.
  */
trait CompileOnSaveAffectedFileListRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_CompileOnSaveAffectedFileListRequest: compileOnSaveAffectedFileList
}
object CompileOnSaveAffectedFileListRequest {
  
  inline def apply(arguments: FileRequestArgs, seq: Double): CompileOnSaveAffectedFileListRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "compileOnSaveAffectedFileList", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompileOnSaveAffectedFileListRequest]
  }
  
  extension [Self <: CompileOnSaveAffectedFileListRequest](x: Self) {
    
    inline def setCommand(value: compileOnSaveAffectedFileList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
