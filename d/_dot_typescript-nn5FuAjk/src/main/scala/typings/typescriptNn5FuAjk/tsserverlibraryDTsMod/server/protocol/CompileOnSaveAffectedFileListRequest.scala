package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompileOnSaveAffectedFileList
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
  var command_CompileOnSaveAffectedFileListRequest: CompileOnSaveAffectedFileList
}
object CompileOnSaveAffectedFileListRequest {
  
  inline def apply(arguments: FileRequestArgs, command: CompileOnSaveAffectedFileList, seq: Double): CompileOnSaveAffectedFileListRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CompileOnSaveAffectedFileListRequest]
  }
  
  extension [Self <: CompileOnSaveAffectedFileListRequest](x: Self) {
    
    inline def setCommand(value: CompileOnSaveAffectedFileList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
