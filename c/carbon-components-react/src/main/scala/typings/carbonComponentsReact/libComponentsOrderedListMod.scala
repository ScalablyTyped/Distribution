package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsOrderedListOrderedListMod.OrderedListProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsOrderedListMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/OrderedList", JSImport.Default)
  @js.native
  val default: FC[OrderedListProps] = js.native
  
  type _To = FC[OrderedListProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsOrderedListMod.foo` */
  override def _to: FC[OrderedListProps] = default
}
