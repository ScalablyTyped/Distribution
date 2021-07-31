package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableActionListMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableActionList", JSImport.Default)
  @js.native
  val default: FC[TableActionListProps] = js.native
  
  type TableActionListProps = ReactDivAttr
  
  type _To = FC[TableActionListProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableActionListMod.foo` */
  override def _to: FC[TableActionListProps] = default
}
