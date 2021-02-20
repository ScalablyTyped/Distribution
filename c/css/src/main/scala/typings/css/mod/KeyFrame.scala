package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyFrame extends Node {
  
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.native
  
  /** The list of "selectors" of the keyframe rule, split on commas. Each “selector” is trimmed from whitespace. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object KeyFrame {
  
  @scala.inline
  def apply(): KeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrame]
  }
  
  @scala.inline
  implicit class KeyFrameMutableBuilder[Self <: KeyFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclarations(value: js.Array[Declaration | Comment]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    @scala.inline
    def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
