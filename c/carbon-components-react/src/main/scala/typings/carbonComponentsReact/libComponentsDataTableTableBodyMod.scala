package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactAttr
import typings.react.mod.FC
import typings.std.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableBodyMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableBody", JSImport.Default)
  @js.native
  val default: FC[TableBodyProps] = js.native
  
  type TableBodyProps = ReactAttr[HTMLTableSectionElement]
  
  type _To = FC[TableBodyProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableBodyMod.foo` */
  override def _to: FC[TableBodyProps] = default
}
