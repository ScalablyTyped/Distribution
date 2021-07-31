package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactAttr
import typings.react.mod.FC
import typings.std.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableHead", JSImport.Default)
  @js.native
  val default: FC[TableHeadProps] = js.native
  
  type TableHeadProps = ReactAttr[HTMLTableSectionElement]
  
  type _To = FC[TableHeadProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadMod.foo` */
  override def _to: FC[TableHeadProps] = default
}
