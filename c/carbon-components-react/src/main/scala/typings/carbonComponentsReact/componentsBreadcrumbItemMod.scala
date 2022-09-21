package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.breadcrumbItemMod.BreadcrumbItemProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBreadcrumbItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/BreadcrumbItem", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLLIElement, BreadcrumbItemProps] = js.native
  
  type _To = ForwardRefReturn[HTMLLIElement, BreadcrumbItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsBreadcrumbItemMod.foo` */
  override def _to: ForwardRefReturn[HTMLLIElement, BreadcrumbItemProps] = default
}
