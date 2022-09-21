package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCombinedCodeFixScope extends StObject {
  
  var args: FileRequestArgs
  
  var `type`: file
}
object GetCombinedCodeFixScope {
  
  inline def apply(args: FileRequestArgs): GetCombinedCodeFixScope = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[GetCombinedCodeFixScope]
  }
  
  extension [Self <: GetCombinedCodeFixScope](x: Self) {
    
    inline def setArgs(value: FileRequestArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
