package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeOptions
  extends StObject
     with IOptions {
  
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[Node] = js.undefined
  
  var screen: js.UndefOr[Screen] = js.undefined
}
object INodeOptions {
  
  inline def apply(): INodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeOptions]
  }
  
  extension [Self <: INodeOptions](x: Self) {
    
    inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
