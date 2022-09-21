package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCodeEdits extends StObject {
  
  var fileName: String
  
  var textChanges: Array[CodeEdit]
}
object FileCodeEdits {
  
  inline def apply(fileName: String, textChanges: Array[CodeEdit]): FileCodeEdits = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textChanges = textChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCodeEdits]
  }
  
  extension [Self <: FileCodeEdits](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setTextChanges(value: Array[CodeEdit]): Self = StObject.set(x, "textChanges", value.asInstanceOf[js.Any])
  }
}
