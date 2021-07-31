package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.skeletonPlaceholderSkeletonPlaceholderMod.SkeletonPlaceholderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonPlaceholderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/SkeletonPlaceholder", JSImport.Default)
  @js.native
  val default: FC[SkeletonPlaceholderProps] = js.native
  
  type _To = FC[SkeletonPlaceholderProps]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonPlaceholderMod.foo` */
  override def _to: FC[SkeletonPlaceholderProps] = default
}
