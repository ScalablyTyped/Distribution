package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FileLocationRequestArgs
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FileRangeRequestArgs
*/
trait FileLocationOrRangeRequestArgs extends StObject
object FileLocationOrRangeRequestArgs {
  
  inline def FileLocationRequestArgs(file: String, line: Double, offset: Double): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FileLocationRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FileLocationRequestArgs]
  }
  
  inline def FileRangeRequestArgs(endLine: Double, endOffset: Double, file: String, startLine: Double, startOffset: Double): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FileRangeRequestArgs = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FileRangeRequestArgs]
  }
}
