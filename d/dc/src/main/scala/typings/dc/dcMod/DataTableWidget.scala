package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableWidget extends BaseMixin[DataTableWidget] {
  @JSName("columns")
  var columns_Original: IGetSet[js.Array[String | (Accessor[_, _]) | Columns], DataTableWidget] = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, Double], DataTableWidget] = js.native
  @JSName("showGroups")
  var showGroups_Original: IGetSet[Boolean, DataTableWidget] = js.native
  @JSName("size")
  var size_Original: IGetSet[Double, DataTableWidget] = js.native
  @JSName("sortBy")
  var sortBy_Original: IGetSet[Accessor[_, _], DataTableWidget] = js.native
  def columns(): js.Array[String | (Accessor[_, _]) | Columns] = js.native
  def columns(t: js.Array[String | (Accessor[_, _]) | Columns]): DataTableWidget = js.native
  def order(): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def order(t: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): DataTableWidget = js.native
  def showGroups(): Boolean = js.native
  def showGroups(t: Boolean): DataTableWidget = js.native
  def size(): Double = js.native
  def size(t: Double): DataTableWidget = js.native
  def sortBy(): Accessor[_, _] = js.native
  def sortBy(t: Accessor[_, _]): DataTableWidget = js.native
}

