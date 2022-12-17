package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPaginationPaginationDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Pagination/Pagination.Skeleton", JSImport.Default)
  @js.native
  val default: FC[PaginationSkeletonProps] = js.native
  
  type PaginationSkeletonProps = ReactDivAttr
  
  type _To = FC[PaginationSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsPaginationPaginationDotSkeletonMod.foo` */
  override def _to: FC[PaginationSkeletonProps] = default
}
