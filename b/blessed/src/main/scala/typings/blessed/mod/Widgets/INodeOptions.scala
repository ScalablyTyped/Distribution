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
  
  @scala.inline
  def apply(): INodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeOptions]
  }
  
  @scala.inline
  implicit class INodeOptionsMutableBuilder[Self <: INodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
