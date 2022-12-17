package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsSkeletonTextSkeletonTextMod.SkeletonTextProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSkeletonTextMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/SkeletonText", JSImport.Default)
  @js.native
  val default: FC[SkeletonTextProps] = js.native
  
  type _To = FC[SkeletonTextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsSkeletonTextMod.foo` */
  override def _to: FC[SkeletonTextProps] = default
}
