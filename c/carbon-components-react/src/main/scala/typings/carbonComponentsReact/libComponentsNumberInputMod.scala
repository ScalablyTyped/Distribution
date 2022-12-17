package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsNumberInputNumberInputMod.NumberInputProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsNumberInputMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/NumberInput", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLInputElement, NumberInputProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/NumberInput", "NumberInput")
  @js.native
  open class NumberInput ()
    extends typings.carbonComponentsReact.libComponentsNumberInputNumberInputMod.NumberInput
  
  type _To = ForwardRefReturn[HTMLInputElement, NumberInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsNumberInputMod.foo` */
  override def _to: ForwardRefReturn[HTMLInputElement, NumberInputProps] = default
}
