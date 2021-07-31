package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactAttr
import typings.react.mod.FC
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Tag/Tag.Skeleton", JSImport.Default)
  @js.native
  val default: FC[TagSkeletonProps] = js.native
  
  type TagSkeletonProps = ReactAttr[HTMLSpanElement]
  
  type _To = FC[TagSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `tagSkeletonMod.foo` */
  override def _to: FC[TagSkeletonProps] = default
}
