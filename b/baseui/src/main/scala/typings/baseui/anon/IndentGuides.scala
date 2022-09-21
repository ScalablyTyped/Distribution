package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndentGuides extends StObject {
  
  @JSName("$expanded")
  var $expanded: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$indentGuides")
  var $indentGuides: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isChildNode")
  var $isChildNode: js.UndefOr[Boolean] = js.undefined
}
object IndentGuides {
  
  inline def apply(): IndentGuides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndentGuides]
  }
  
  extension [Self <: IndentGuides](x: Self) {
    
    inline def set$expanded(value: Boolean): Self = StObject.set(x, "$expanded", value.asInstanceOf[js.Any])
    
    inline def set$expandedUndefined: Self = StObject.set(x, "$expanded", js.undefined)
    
    inline def set$indentGuides(value: Boolean): Self = StObject.set(x, "$indentGuides", value.asInstanceOf[js.Any])
    
    inline def set$indentGuidesUndefined: Self = StObject.set(x, "$indentGuides", js.undefined)
    
    inline def set$isChildNode(value: Boolean): Self = StObject.set(x, "$isChildNode", value.asInstanceOf[js.Any])
    
    inline def set$isChildNodeUndefined: Self = StObject.set(x, "$isChildNode", js.undefined)
  }
}
