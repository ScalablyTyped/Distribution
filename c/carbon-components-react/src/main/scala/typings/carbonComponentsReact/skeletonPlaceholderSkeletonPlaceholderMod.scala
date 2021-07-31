package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonPlaceholderSkeletonPlaceholderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/SkeletonPlaceholder/SkeletonPlaceholder", JSImport.Default)
  @js.native
  val default: FC[SkeletonPlaceholderProps] = js.native
  
  type SkeletonPlaceholderProps = ReactDivAttr
  
  type _To = FC[SkeletonPlaceholderProps]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonPlaceholderSkeletonPlaceholderMod.foo` */
  override def _to: FC[SkeletonPlaceholderProps] = default
}
