package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeBreakpointsColors
import typings.cathoQuantum.anon.CallbackFn
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLParagraphElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackBarMod {
  
  @JSImport("@catho/quantum/SnackBar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SnackBarProps, js.Object, Any]
  
  type SnackBar = Component[SnackBarProps, js.Object, Any]
  
  trait SnackBarProps extends StObject {
    
    var actionTrigger: js.UndefOr[CallbackFn] = js.undefined
    
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    var hideIcon: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[
        (MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]) | (TouchEventHandler[HTMLButtonElement | HTMLAnchorElement])
      ] = js.undefined
    
    var secondsToClose: js.UndefOr[Double] = js.undefined
    
    var skin: js.UndefOr[primary | success | error | neutral | warning] = js.undefined
    
    var text: String | HTMLParagraphElement
    
    var theme: js.UndefOr[BaseFontSizeBreakpointsColors] = js.undefined
  }
  object SnackBarProps {
    
    inline def apply(text: String | HTMLParagraphElement): SnackBarProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnackBarProps] (val x: Self) extends AnyVal {
      
      inline def setActionTrigger(value: CallbackFn): Self = StObject.set(x, "actionTrigger", value.asInstanceOf[js.Any])
      
      inline def setActionTriggerUndefined: Self = StObject.set(x, "actionTrigger", js.undefined)
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setHideIcon(value: Boolean): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      inline def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setOnClose(
        value: (MouseEvent[HTMLButtonElement | HTMLAnchorElement, NativeMouseEvent]) | (TouchEvent[HTMLButtonElement | HTMLAnchorElement]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setSecondsToClose(value: Double): Self = StObject.set(x, "secondsToClose", value.asInstanceOf[js.Any])
      
      inline def setSecondsToCloseUndefined: Self = StObject.set(x, "secondsToClose", js.undefined)
      
      inline def setSkin(value: primary | success | error | neutral | warning): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setText(value: String | HTMLParagraphElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: BaseFontSizeBreakpointsColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
