package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFace
  extends StObject
     with Node
     with AtRule {
  
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
}
object FontFace {
  
  @scala.inline
  def apply(): FontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit class FontFaceMutableBuilder[Self <: FontFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclarations(value: js.Array[Declaration | Comment]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    @scala.inline
    def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = StObject.set(x, "declarations", js.Array(value :_*))
  }
}
