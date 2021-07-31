package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.breadcrumbBreadcrumbMod.BreadcrumbProps
import typings.carbonComponentsReact.breadcrumbItemMod.BreadcrumbItemProps
import typings.carbonComponentsReact.breadcrumbSkeletonMod.BreadcrumbSkeletonProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", JSImport.Default)
  @js.native
  val default: FC[BreadcrumbProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: FC[BreadcrumbProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", "BreadcrumbItem")
  @js.native
  val BreadcrumbItem: FC[BreadcrumbItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb", "BreadcrumbSkeleton")
  @js.native
  val BreadcrumbSkeleton: FC[BreadcrumbSkeletonProps] = js.native
  
  type _To = FC[BreadcrumbProps]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbMod.foo` */
  override def _to: FC[BreadcrumbProps] = default
}
