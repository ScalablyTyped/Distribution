package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.buttonSetButtonSetMod.ButtonSetProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonSetMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ButtonSet", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLDivElement, ButtonSetProps] = js.native
  
  type _To = ForwardRefReturn[HTMLDivElement, ButtonSetProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonSetMod.foo` */
  override def _to: ForwardRefReturn[HTMLDivElement, ButtonSetProps] = default
}
