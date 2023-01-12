package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CstNodeLocation extends StObject {
  
  var endColumn: js.UndefOr[Double] = js.undefined
  
  var endLine: js.UndefOr[Double] = js.undefined
  
  var endOffset: js.UndefOr[Double] = js.undefined
  
  var startColumn: js.UndefOr[Double] = js.undefined
  
  var startLine: js.UndefOr[Double] = js.undefined
  
  var startOffset: Double
}
object CstNodeLocation {
  
  inline def apply(startOffset: Double): CstNodeLocation = {
    val __obj = js.Dynamic.literal(startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CstNodeLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CstNodeLocation] (val x: Self) extends AnyVal {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
