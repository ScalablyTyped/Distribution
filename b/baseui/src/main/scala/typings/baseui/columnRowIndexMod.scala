package typings.baseui

import typings.baseui.dataTableTypesMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnRowIndexMod {
  
  @JSImport("baseui/data-table/column-row-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): RowIndexColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[RowIndexColumn]
  
  type FilterParameters = js.Object
  
  type RowIndexColumn = ColumnOptions[Value, FilterParameters]
  
  type Value = Null
}
