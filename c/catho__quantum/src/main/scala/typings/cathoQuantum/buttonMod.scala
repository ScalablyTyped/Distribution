package typings.cathoQuantum

import typings.cathoQuantum.anon.Breakpoints
import typings.cathoQuantum.buttonIconButtonMod.IconButton
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.reset
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.submit
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.cathoQuantum.iconMod.IconNames
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@catho/quantum/Button", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ButtonProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Button", "default.Icon")
    @js.native
    def Icon: IconButton = js.native
    inline def Icon_=(x: IconButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
  }
  
  type Button = Component[ButtonProps, js.Object, Any]
  
  trait ButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    @JSName("$as")
    var $as: js.UndefOr[Element | String] = js.undefined
    
    var center: js.UndefOr[Boolean] = js.undefined
    
    @JSName("children")
    var children_ButtonProps: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[IconNames | String] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
    
    var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.undefined
    
    var stroked: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[Breakpoints] = js.undefined
    
    @JSName("type")
    var type_ButtonProps: js.UndefOr[button | reset | submit] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def set$as(value: Element | String): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setIcon(value: IconNames | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: neutral | primary | secondary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setStroked(value: Boolean): Self = StObject.set(x, "stroked", value.asInstanceOf[js.Any])
      
      inline def setStrokedUndefined: Self = StObject.set(x, "stroked", js.undefined)
      
      inline def setTheme(value: Breakpoints): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: button | reset | submit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
