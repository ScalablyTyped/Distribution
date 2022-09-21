package typings.baseui

import typings.baseui.tableTypesMod.HeadCellProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortableHeadCellMod {
  
  @JSImport("baseui/table/sortable-head-cell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: HeadCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SortableHeadCellFactory(): js.Function1[/* props */ HeadCellProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHeadCellFactory")().asInstanceOf[js.Function1[/* props */ HeadCellProps, Element]]
  inline def SortableHeadCellFactory(CustomHeadCell: ComponentType[HeadCellProps]): js.Function1[/* props */ HeadCellProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHeadCellFactory")(CustomHeadCell.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ HeadCellProps, Element]]
}
