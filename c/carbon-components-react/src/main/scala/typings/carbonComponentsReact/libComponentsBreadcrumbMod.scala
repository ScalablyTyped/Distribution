package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsBreadcrumbBreadcrumbDotSkeletonMod.BreadcrumbSkeletonProps
import typings.carbonComponentsReact.libComponentsBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import typings.carbonComponentsReact.libComponentsBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.FC
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBreadcrumbMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLElement, BreadcrumbProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: ForwardRefReturn[HTMLElement, BreadcrumbProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", "BreadcrumbItem")
  @js.native
  val BreadcrumbItem: ForwardRefReturn[HTMLLIElement, BreadcrumbItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", "BreadcrumbSkeleton")
  @js.native
  val BreadcrumbSkeleton: FC[BreadcrumbSkeletonProps] = js.native
  
  type _To = ForwardRefReturn[HTMLElement, BreadcrumbProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsBreadcrumbMod.foo` */
  override def _to: ForwardRefReturn[HTMLElement, BreadcrumbProps] = default
}
