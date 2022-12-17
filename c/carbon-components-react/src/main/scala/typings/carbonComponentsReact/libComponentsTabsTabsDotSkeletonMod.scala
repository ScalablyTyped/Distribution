package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTabsTabsDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Tabs/Tabs.Skeleton", JSImport.Default)
  @js.native
  val default: FC[TabsSkeletonProps] = js.native
  
  type TabsSkeletonProps = ReactDivAttr
  
  type _To = FC[TabsSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTabsTabsDotSkeletonMod.foo` */
  override def _to: FC[TabsSkeletonProps] = default
}
