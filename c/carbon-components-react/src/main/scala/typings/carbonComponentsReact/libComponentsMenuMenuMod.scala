package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.lg
import typings.carbonComponentsReact.carbonComponentsReactStrings.md
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.libComponentsMenuMenuGroupMod.MenuGroupProps
import typings.carbonComponentsReact.libComponentsMenuMenuItemMod.MenuItemProps
import typings.carbonComponentsReact.libComponentsMenuMenuRadioGroupMod.MenuRadioGroupProps
import typings.carbonComponentsReact.libComponentsMenuMenuSelectableItemMod.MenuSelectableItemProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMenuMenuMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Menu/Menu", JSImport.Default)
  @js.native
  val default: MenuComponent = js.native
  
  @js.native
  trait MenuComponent
    extends StObject
       with FunctionComponent[MenuProps] {
    
    val MenuDivider: FC[js.Object] = js.native
    
    val MenuGroup: FC[MenuGroupProps] = js.native
    
    val MenuItem: FC[MenuItemProps] = js.native
    
    val MenuRadioGroup: FC[MenuRadioGroupProps] = js.native
    
    val MenuSelectableItem: FC[MenuSelectableItemProps] = js.native
  }
  
  trait MenuProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* evt */ KeyboardEvent[HTMLUListElement], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[sm | md | lg] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var x: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var y: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnKeyDown(value: /* evt */ KeyboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setX(value: Double | js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: Double | js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  type _To = MenuComponent
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsMenuMenuMod.foo` */
  override def _to: MenuComponent = default
}
