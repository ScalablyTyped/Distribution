package typings.cathoQuantum

import typings.cathoQuantum.anon.`12`
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@catho/quantum/Dialog", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DialogProps, js.Object, Any]
  
  type Dialog = Component[DialogProps, js.Object, Any]
  
  trait DialogProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode
    
    var closeOnTime: js.UndefOr[Double] = js.undefined
    
    var disableClickOutside: Boolean
    
    var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var theme: js.UndefOr[`12`] = js.undefined
  }
  object DialogProps {
    
    inline def apply(disableClickOutside: Boolean): DialogProps = {
      val __obj = js.Dynamic.literal(disableClickOutside = disableClickOutside.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCloseOnTime(value: Double): Self = StObject.set(x, "closeOnTime", value.asInstanceOf[js.Any])
      
      inline def setCloseOnTimeUndefined: Self = StObject.set(x, "closeOnTime", js.undefined)
      
      inline def setDisableClickOutside(value: Boolean): Self = StObject.set(x, "disableClickOutside", value.asInstanceOf[js.Any])
      
      inline def setOnClickOutside(value: () => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setTheme(value: `12`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
