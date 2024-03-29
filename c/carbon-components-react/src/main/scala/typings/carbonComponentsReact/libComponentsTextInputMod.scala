package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsTextInputControlledPasswordInputMod.ControlledPasswordInputProps
import typings.carbonComponentsReact.libComponentsTextInputPasswordInputMod.PasswordInputProps
import typings.carbonComponentsReact.libComponentsTextInputTextInputMod.TextInputFC
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextInputMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TextInput", JSImport.Default)
  @js.native
  val default: TextInputFC = js.native
  
  /**
    * @deprecated
    */
  @JSImport("carbon-components-react/lib/components/TextInput", "ControlledPasswordInput")
  @js.native
  val ControlledPasswordInput: ForwardRefReturn[HTMLInputElement, ControlledPasswordInputProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/TextInput", "PasswordInput")
  @js.native
  val PasswordInput: ForwardRefReturn[HTMLInputElement, PasswordInputProps] = js.native
  
  type _To = TextInputFC
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTextInputMod.foo` */
  override def _to: TextInputFC = default
}
