package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsSwitchSwitchMod.SwitchProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSwitchMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Switch", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLButtonElement, SwitchProps] = js.native
  
  type _To = ForwardRefReturn[HTMLButtonElement, SwitchProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsSwitchMod.foo` */
  override def _to: ForwardRefReturn[HTMLButtonElement, SwitchProps] = default
}
