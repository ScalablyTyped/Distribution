package typings.baseui

import typings.baseui.anon.Menus
import typings.baseui.anon.`14`
import typings.baseui.menuTypesMod.NestedMenuContextProps
import typings.baseui.menuTypesMod.NestedMenuRef
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuNestedMenusMod {
  
  @JSImport("baseui/menu/nested-menus", JSImport.Default)
  @js.native
  open class default () extends NestedMenus
  
  @JSImport("baseui/menu/nested-menus", "NestedMenuContext")
  @js.native
  val NestedMenuContext: Context[NestedMenuContextProps] = js.native
  
  trait NestedMenuProps extends StObject {
    
    var children: ReactNode
  }
  object NestedMenuProps {
    
    inline def apply(): NestedMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedMenuProps]
    }
    
    extension [Self <: NestedMenuProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait NestedMenuState extends StObject {
    
    var menus: js.Array[NestedMenuRef]
    
    var nestedMenuHoverIndex: Double
  }
  object NestedMenuState {
    
    inline def apply(menus: js.Array[NestedMenuRef], nestedMenuHoverIndex: Double): NestedMenuState = {
      val __obj = js.Dynamic.literal(menus = menus.asInstanceOf[js.Any], nestedMenuHoverIndex = nestedMenuHoverIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedMenuState]
    }
    
    extension [Self <: NestedMenuState](x: Self) {
      
      inline def setMenus(value: js.Array[NestedMenuRef]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
      
      inline def setMenusVarargs(value: NestedMenuRef*): Self = StObject.set(x, "menus", js.Array(value*))
      
      inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NestedMenus extends Component[NestedMenuProps, NestedMenuState, Any] {
    
    def addMenuToNesting(ref: NestedMenuRef): Unit = js.native
    
    def findMenuIndexByRef(ref: NestedMenuRef): Double = js.native
    
    def getChildMenu(ref: NestedMenuRef): js.UndefOr[NestedMenuRef | Null] = js.native
    
    def getParentMenu(ref: NestedMenuRef): js.UndefOr[NestedMenuRef | Null] = js.native
    
    def handleMenuMouseEnter(event: MouseEvent): Unit = js.native
    
    def handleMenuMouseLeave(event: MouseEvent): Unit = js.native
    
    def isNestedMenuVisible(ref: NestedMenuRef): Boolean = js.native
    
    var mountRef: `14` = js.native
    
    var mouseLeaveTimeoueId: Any = js.native
    
    def removeMenuFromNesting(ref: NestedMenuRef): Unit = js.native
    
    @JSName("state")
    var state_NestedMenus: Menus = js.native
  }
}
