package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTableWidget extends BaseMixin[DataTableWidget] {
  
  def beginSlice(): Double = js.native
  def beginSlice(t: Double): DataTableWidget = js.native
  @JSName("beginSlice")
  var beginSlice_Original: IGetSet[Double, DataTableWidget] = js.native
  
  def columns(): js.Array[String | (Accessor[_, _]) | Columns] = js.native
  def columns(t: js.Array[String | (Accessor[_, _]) | Columns]): DataTableWidget = js.native
  @JSName("columns")
  var columns_Original: IGetSet[js.Array[String | (Accessor[_, _]) | Columns], DataTableWidget] = js.native
  
  def endSlice(): Double = js.native
  def endSlice(t: Double): DataTableWidget = js.native
  @JSName("endSlice")
  var endSlice_Original: IGetSet[Double, DataTableWidget] = js.native
  
  def order(): js.Function = js.native
  def order(t: js.Function): DataTableWidget = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function, DataTableWidget] = js.native
  
  def section(): js.Function = js.native
  def section(t: js.Function): DataTableWidget = js.native
  @JSName("section")
  var section_Original: IGetSet[js.Function, DataTableWidget] = js.native
  
  def showSections(): Boolean = js.native
  def showSections(t: Boolean): DataTableWidget = js.native
  @JSName("showSections")
  var showSections_Original: IGetSet[Boolean, DataTableWidget] = js.native
  
  def size(): Double = js.native
  def size(t: Double): DataTableWidget = js.native
  @JSName("size")
  var size_Original: IGetSet[Double, DataTableWidget] = js.native
  
  def sortBy(): Accessor[_, _] = js.native
  def sortBy(t: Accessor[_, _]): DataTableWidget = js.native
  @JSName("sortBy")
  var sortBy_Original: IGetSet[Accessor[_, _], DataTableWidget] = js.native
}
