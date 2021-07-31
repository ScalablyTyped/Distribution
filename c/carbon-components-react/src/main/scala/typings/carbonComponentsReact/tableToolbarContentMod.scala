package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableToolbarContentMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableToolbarContent", JSImport.Default)
  @js.native
  val default: FC[TableToolbarContentProps] = js.native
  
  type TableToolbarContentProps = ReactDivAttr
  
  type _To = FC[TableToolbarContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableToolbarContentMod.foo` */
  override def _to: FC[TableToolbarContentProps] = default
}
