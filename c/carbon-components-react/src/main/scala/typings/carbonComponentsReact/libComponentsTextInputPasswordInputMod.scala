package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsTextInputPropsMod.TextInputSharedProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.TooltipAlignment
import typings.carbonComponentsReact.typingsSharedMod.TooltipPosition
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextInputPasswordInputMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TextInput/PasswordInput", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLInputElement, PasswordInputProps] = js.native
  
  trait PasswordInputProps
    extends StObject
       with TextInputSharedProps {
    
    var hidePasswordLabel: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var onTogglePasswordVisibility: js.UndefOr[js.Function1[/* evt */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    var showPasswordLabel: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tooltipAlignment: js.UndefOr[TooltipAlignment] = js.undefined
    
    var tooltipPosition: js.UndefOr[TooltipPosition] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
    
    var warnText: js.UndefOr[ReactNode] = js.undefined
  }
  object PasswordInputProps {
    
    inline def apply(id: String): PasswordInputProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PasswordInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasswordInputProps] (val x: Self) extends AnyVal {
      
      inline def setHidePasswordLabel(value: String): Self = StObject.set(x, "hidePasswordLabel", value.asInstanceOf[js.Any])
      
      inline def setHidePasswordLabelUndefined: Self = StObject.set(x, "hidePasswordLabel", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setOnTogglePasswordVisibility(value: /* evt */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onTogglePasswordVisibility", js.Any.fromFunction1(value))
      
      inline def setOnTogglePasswordVisibilityUndefined: Self = StObject.set(x, "onTogglePasswordVisibility", js.undefined)
      
      inline def setShowPasswordLabel(value: String): Self = StObject.set(x, "showPasswordLabel", value.asInstanceOf[js.Any])
      
      inline def setShowPasswordLabelUndefined: Self = StObject.set(x, "showPasswordLabel", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTooltipAlignment(value: TooltipAlignment): Self = StObject.set(x, "tooltipAlignment", value.asInstanceOf[js.Any])
      
      inline def setTooltipAlignmentUndefined: Self = StObject.set(x, "tooltipAlignment", js.undefined)
      
      inline def setTooltipPosition(value: TooltipPosition): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnText(value: ReactNode): Self = StObject.set(x, "warnText", value.asInstanceOf[js.Any])
      
      inline def setWarnTextUndefined: Self = StObject.set(x, "warnText", js.undefined)
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLInputElement, PasswordInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTextInputPasswordInputMod.foo` */
  override def _to: ForwardRefReturn[HTMLInputElement, PasswordInputProps] = default
}
