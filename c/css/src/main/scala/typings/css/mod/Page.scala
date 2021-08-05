package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page
  extends StObject
     with Node
     with AtRule {
  
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
  
  /** The list of selectors of the rule, split on commas. Each selector is trimmed from whitespace and comments. */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}
object Page {
  
  inline def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setDeclarations(value: js.Array[Declaration | Comment]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
