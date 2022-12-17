package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsSelectSelectMod.SelectProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Select", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLSelectElement, SelectProps] = js.native
  
  type _To = ForwardRefReturn[HTMLSelectElement, SelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsSelectMod.foo` */
  override def _to: ForwardRefReturn[HTMLSelectElement, SelectProps] = default
}
