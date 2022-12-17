package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBreadcrumbBreadcrumbDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Breadcrumb/Breadcrumb.Skeleton", JSImport.Default)
  @js.native
  val default: FC[BreadcrumbSkeletonProps] = js.native
  
  type BreadcrumbSkeletonProps = ReactDivAttr
  
  type _To = FC[BreadcrumbSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsBreadcrumbBreadcrumbDotSkeletonMod.foo` */
  override def _to: FC[BreadcrumbSkeletonProps] = default
}
