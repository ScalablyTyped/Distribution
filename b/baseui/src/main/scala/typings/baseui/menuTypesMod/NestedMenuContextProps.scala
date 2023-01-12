package typings.baseui.menuTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedMenuContextProps extends StObject {
  
  def addMenuToNesting(ref: NestedMenuRef): Unit
  
  def getChildMenu(ref: NestedMenuRef): js.UndefOr[NestedMenuRef | Null]
  
  def getParentMenu(ref: NestedMenuRef): js.UndefOr[NestedMenuRef | Null]
  
  def isNestedMenuVisible(ref: NestedMenuRef): Boolean
  
  var mountRef: NestedMenuRef
  
  var nestedMenuHoverIndex: Double
  
  def removeMenuFromNesting(ref: NestedMenuRef): Unit
}
object NestedMenuContextProps {
  
  inline def apply(
    addMenuToNesting: NestedMenuRef => Unit,
    getChildMenu: NestedMenuRef => js.UndefOr[NestedMenuRef | Null],
    getParentMenu: NestedMenuRef => js.UndefOr[NestedMenuRef | Null],
    isNestedMenuVisible: NestedMenuRef => Boolean,
    mountRef: NestedMenuRef,
    nestedMenuHoverIndex: Double,
    removeMenuFromNesting: NestedMenuRef => Unit
  ): NestedMenuContextProps = {
    val __obj = js.Dynamic.literal(addMenuToNesting = js.Any.fromFunction1(addMenuToNesting), getChildMenu = js.Any.fromFunction1(getChildMenu), getParentMenu = js.Any.fromFunction1(getParentMenu), isNestedMenuVisible = js.Any.fromFunction1(isNestedMenuVisible), mountRef = mountRef.asInstanceOf[js.Any], nestedMenuHoverIndex = nestedMenuHoverIndex.asInstanceOf[js.Any], removeMenuFromNesting = js.Any.fromFunction1(removeMenuFromNesting))
    __obj.asInstanceOf[NestedMenuContextProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedMenuContextProps] (val x: Self) extends AnyVal {
    
    inline def setAddMenuToNesting(value: NestedMenuRef => Unit): Self = StObject.set(x, "addMenuToNesting", js.Any.fromFunction1(value))
    
    inline def setGetChildMenu(value: NestedMenuRef => js.UndefOr[NestedMenuRef | Null]): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    inline def setGetParentMenu(value: NestedMenuRef => js.UndefOr[NestedMenuRef | Null]): Self = StObject.set(x, "getParentMenu", js.Any.fromFunction1(value))
    
    inline def setIsNestedMenuVisible(value: NestedMenuRef => Boolean): Self = StObject.set(x, "isNestedMenuVisible", js.Any.fromFunction1(value))
    
    inline def setMountRef(value: NestedMenuRef): Self = StObject.set(x, "mountRef", value.asInstanceOf[js.Any])
    
    inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def setRemoveMenuFromNesting(value: NestedMenuRef => Unit): Self = StObject.set(x, "removeMenuFromNesting", js.Any.fromFunction1(value))
  }
}
