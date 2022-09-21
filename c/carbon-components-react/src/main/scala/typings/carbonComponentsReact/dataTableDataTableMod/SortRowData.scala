package typings.carbonComponentsReact.dataTableDataTableMod

import typings.carbonComponentsReact.sortingMod.DataTableSortState
import typings.carbonComponentsReact.sortingMod.DataTableSortStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortRowData extends StObject {
  
  def compare(a: Any, b: Any): Double = js.native
  def compare(a: Any, b: Any, locale: String): Double = js.native
  
  var key: String = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var sortDirection: DataTableSortState = js.native
  
  var sortStates: DataTableSortStates = js.native
}
