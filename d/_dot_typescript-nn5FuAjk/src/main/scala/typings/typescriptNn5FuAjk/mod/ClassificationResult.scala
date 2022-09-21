package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationResult extends StObject {
  
  var entries: Array[ClassificationInfo]
  
  var finalLexState: EndOfLineState
}
object ClassificationResult {
  
  inline def apply(entries: Array[ClassificationInfo], finalLexState: EndOfLineState): ClassificationResult = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], finalLexState = finalLexState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationResult]
  }
  
  extension [Self <: ClassificationResult](x: Self) {
    
    inline def setEntries(value: Array[ClassificationInfo]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setFinalLexState(value: EndOfLineState): Self = StObject.set(x, "finalLexState", value.asInstanceOf[js.Any])
  }
}
