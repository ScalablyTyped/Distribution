package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataGridWidget extends BaseMixin[DataGridWidget] {
  @JSName("htmlGroup")
  var htmlGroup_Original: IGetSet[Accessor[_, String], DataTableWidget] = js.native
  @JSName("html")
  var html_Original: IGetSet[Accessor[_, String], DataTableWidget] = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, Double], DataTableWidget] = js.native
  @JSName("size")
  var size_Original: IGetSet[Double, DataTableWidget] = js.native
  @JSName("sortBy")
  var sortBy_Original: IGetSet[Accessor[_, _], DataTableWidget] = js.native
  def html(): Accessor[_, String] = js.native
  def html(t: Accessor[_, String]): DataTableWidget = js.native
  def htmlGroup(): Accessor[_, String] = js.native
  def htmlGroup(t: Accessor[_, String]): DataTableWidget = js.native
  def order(): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def order(t: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): DataTableWidget = js.native
  def size(): Double = js.native
  def size(t: Double): DataTableWidget = js.native
  def sortBy(): Accessor[_, _] = js.native
  def sortBy(t: Accessor[_, _]): DataTableWidget = js.native
}

