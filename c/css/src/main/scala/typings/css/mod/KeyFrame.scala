package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyFrame
  extends StObject
     with Node {
  
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
  
  /** The list of "selectors" of the keyframe rule, split on commas. Each “selector” is trimmed from whitespace. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object KeyFrame {
  
  inline def apply(): KeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrame]
  }
  
  extension [Self <: KeyFrame](x: Self) {
    
    inline def setDeclarations(value: js.Array[Declaration | Comment]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
