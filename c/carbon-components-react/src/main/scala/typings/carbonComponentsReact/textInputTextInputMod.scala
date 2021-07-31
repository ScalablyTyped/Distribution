package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.carbonComponentsReactStrings.xl
import typings.carbonComponentsReact.controlledPasswordInputMod.ControlledPasswordInputProps
import typings.carbonComponentsReact.passwordInputMod.PasswordInputProps
import typings.carbonComponentsReact.propsMod.TextInputSharedProps
import typings.carbonComponentsReact.typingsSharedMod.CarbonInputSize
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.std.Extract
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputTextInputMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TextInput/TextInput", JSImport.Default)
  @js.native
  val default: TextInputFC = js.native
  
  @js.native
  trait TextInputFC
    extends StObject
       with ForwardRefExoticComponent[ForwardRefProps[HTMLInputElement, TextInputProps]] {
    
    val ControlledPasswordInput: ForwardRefReturn[HTMLInputElement, ControlledPasswordInputProps] = js.native
    
    val PasswordInput: ForwardRefReturn[HTMLInputElement, PasswordInputProps] = js.native
  }
  
  trait TextInputProps
    extends StObject
       with TextInputSharedProps {
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Extract[CarbonInputSize, sm | xl]] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
    
    var warnText: js.UndefOr[ReactNode] = js.undefined
  }
  object TextInputProps {
    
    @scala.inline
    def apply(id: String): TextInputProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit class TextInputPropsMutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setSize(value: Extract[CarbonInputSize, sm | xl]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnText(value: ReactNode): Self = StObject.set(x, "warnText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnTextUndefined: Self = StObject.set(x, "warnText", js.undefined)
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  type _To = TextInputFC
  
  /* This means you don't have to write `default`, but can instead just say `textInputTextInputMod.foo` */
  override def _to: TextInputFC = default
}
