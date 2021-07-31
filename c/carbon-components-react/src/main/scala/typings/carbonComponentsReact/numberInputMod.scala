package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.numberInputNumberInputMod.NumberInputProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberInputMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/NumberInput", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLInputElement, NumberInputProps] = js.native
  
  type _To = ForwardRefReturn[HTMLInputElement, NumberInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `numberInputMod.foo` */
  override def _to: ForwardRefReturn[HTMLInputElement, NumberInputProps] = default
}
