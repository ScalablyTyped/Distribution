package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.lg
import typings.carbonComponentsReact.carbonComponentsReactStrings.md
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.carbonComponentsReactStrings.xl
import typings.carbonComponentsReact.libComponentsTextInputControlledPasswordInputMod.ControlledPasswordInputProps
import typings.carbonComponentsReact.libComponentsTextInputPasswordInputMod.PasswordInputProps
import typings.carbonComponentsReact.libComponentsTextInputPropsMod.TextInputSharedProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextInputTextInputMod extends Shortcut {
  
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
    
    var size: js.UndefOr[sm | md | lg | xl] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
    
    var warnText: js.UndefOr[ReactNode] = js.undefined
  }
  object TextInputProps {
    
    inline def apply(id: String): TextInputProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setSize(value: sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnText(value: ReactNode): Self = StObject.set(x, "warnText", value.asInstanceOf[js.Any])
      
      inline def setWarnTextUndefined: Self = StObject.set(x, "warnText", js.undefined)
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  type _To = TextInputFC
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTextInputTextInputMod.foo` */
  override def _to: TextInputFC = default
}
