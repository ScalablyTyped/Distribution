package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableWidget extends BaseMixin[DataTableWidget] {
  @JSName("columns")
  var columns_Original: IGetSet[js.Array[java.lang.String | (Accessor[_, _]) | Columns], DataTableWidget] = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, scala.Double], DataTableWidget] = js.native
  @JSName("showGroups")
  var showGroups_Original: IGetSet[scala.Boolean, DataTableWidget] = js.native
  @JSName("size")
  var size_Original: IGetSet[scala.Double, DataTableWidget] = js.native
  @JSName("sortBy")
  var sortBy_Original: IGetSet[Accessor[_, _], DataTableWidget] = js.native
  def columns(): js.Array[java.lang.String | (Accessor[_, _]) | Columns] = js.native
  def columns(t: js.Array[java.lang.String | (Accessor[_, _]) | Columns]): DataTableWidget = js.native
  def order(): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def order(t: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]): DataTableWidget = js.native
  def showGroups(): scala.Boolean = js.native
  def showGroups(t: scala.Boolean): DataTableWidget = js.native
  def size(): scala.Double = js.native
  def size(t: scala.Double): DataTableWidget = js.native
  def sortBy(): Accessor[_, _] = js.native
  def sortBy(t: Accessor[_, _]): DataTableWidget = js.native
}

