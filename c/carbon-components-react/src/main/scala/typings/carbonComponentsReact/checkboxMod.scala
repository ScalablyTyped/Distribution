package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.checkboxCheckboxMod.CheckboxProps
import typings.react.mod.RefForwardingComponent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Checkbox", JSImport.Default)
  @js.native
  val default: RefForwardingComponent[HTMLInputElement, CheckboxProps] = js.native
  
  type _To = RefForwardingComponent[HTMLInputElement, CheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxMod.foo` */
  override def _to: RefForwardingComponent[HTMLInputElement, CheckboxProps] = default
}
