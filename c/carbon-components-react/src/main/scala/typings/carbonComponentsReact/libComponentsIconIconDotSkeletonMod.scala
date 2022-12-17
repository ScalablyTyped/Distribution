package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsIconIconDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Icon/Icon.Skeleton", JSImport.Default)
  @js.native
  val default: FC[IconSkeletonProps] = js.native
  
  type IconSkeletonProps = ReactDivAttr
  
  type _To = FC[IconSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsIconIconDotSkeletonMod.foo` */
  override def _to: FC[IconSkeletonProps] = default
}
