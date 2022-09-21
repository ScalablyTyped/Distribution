package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.skeletonIconSkeletonIconMod.SkeletonIconProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonIconMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/SkeletonIcon", JSImport.Default)
  @js.native
  val default: FC[SkeletonIconProps] = js.native
  
  type _To = FC[SkeletonIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonIconMod.foo` */
  override def _to: FC[SkeletonIconProps] = default
}
