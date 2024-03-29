package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsTextInputPropsMod.TextInputSharedProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.TooltipAlignment
import typings.carbonComponentsReact.typingsSharedMod.TooltipPosition
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextInputControlledPasswordInputMod extends Shortcut {
  
  /**
    * @deprecated
    */
  @JSImport("carbon-components-react/lib/components/TextInput/ControlledPasswordInput", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLInputElement, ControlledPasswordInputProps] = js.native
  
  trait ControlledPasswordInputProps
    extends StObject
       with TextInputSharedProps {
    
    var hidePasswordLabel: js.UndefOr[String] = js.undefined
    
    var showPasswordLabel: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var togglePasswordVisibility: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    var tooltipAlignment: js.UndefOr[TooltipAlignment] = js.undefined
    
    var tooltipPosition: js.UndefOr[TooltipPosition] = js.undefined
  }
  object ControlledPasswordInputProps {
    
    inline def apply(id: String): ControlledPasswordInputProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledPasswordInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlledPasswordInputProps] (val x: Self) extends AnyVal {
      
      inline def setHidePasswordLabel(value: String): Self = StObject.set(x, "hidePasswordLabel", value.asInstanceOf[js.Any])
      
      inline def setHidePasswordLabelUndefined: Self = StObject.set(x, "hidePasswordLabel", js.undefined)
      
      inline def setShowPasswordLabel(value: String): Self = StObject.set(x, "showPasswordLabel", value.asInstanceOf[js.Any])
      
      inline def setShowPasswordLabelUndefined: Self = StObject.set(x, "showPasswordLabel", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTogglePasswordVisibility(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "togglePasswordVisibility", js.Any.fromFunction1(value))
      
      inline def setTogglePasswordVisibilityUndefined: Self = StObject.set(x, "togglePasswordVisibility", js.undefined)
      
      inline def setTooltipAlignment(value: TooltipAlignment): Self = StObject.set(x, "tooltipAlignment", value.asInstanceOf[js.Any])
      
      inline def setTooltipAlignmentUndefined: Self = StObject.set(x, "tooltipAlignment", js.undefined)
      
      inline def setTooltipPosition(value: TooltipPosition): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLInputElement, ControlledPasswordInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTextInputControlledPasswordInputMod.foo` */
  override def _to: ForwardRefReturn[HTMLInputElement, ControlledPasswordInputProps] = default
}
