package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsLinkLinkMod.LinkProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLinkMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Link", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLAnchorElement, LinkProps] = js.native
  
  type _To = ForwardRefReturn[HTMLAnchorElement, LinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsLinkMod.foo` */
  override def _to: ForwardRefReturn[HTMLAnchorElement, LinkProps] = default
}
