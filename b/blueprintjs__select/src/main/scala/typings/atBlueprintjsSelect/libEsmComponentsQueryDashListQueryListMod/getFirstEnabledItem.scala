package typings.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod

import typings.atBlueprintjsSelect.libEsmCommonListItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "getFirstEnabledItem")
@js.native
object getFirstEnabledItem extends js.Object {
  def apply[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  def apply[T](items: js.Array[T], itemDisabled: String): T | ICreateNewItem | Null = js.native
  def apply[T](items: js.Array[T], itemDisabled: String, direction: Double): T | ICreateNewItem | Null = js.native
  def apply[T](items: js.Array[T], itemDisabled: String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def apply[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  def apply[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  def apply[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
}

