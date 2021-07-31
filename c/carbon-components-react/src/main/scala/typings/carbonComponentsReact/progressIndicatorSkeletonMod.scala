package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ProgressIndicator/ProgressIndicator.Skeleton", JSImport.Default)
  @js.native
  val default: FC[ProgressIndicatorSkeletonProps] = js.native
  
  type ProgressIndicatorSkeletonProps = HTMLAttributes[HTMLUListElement]
  
  type _To = FC[ProgressIndicatorSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `progressIndicatorSkeletonMod.foo` */
  override def _to: FC[ProgressIndicatorSkeletonProps] = default
}
