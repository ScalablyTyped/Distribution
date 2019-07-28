package typings.c3

import typings.c3.c3Mod.PrimitiveArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  var done: js.UndefOr[js.Function0[_]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var json: js.UndefOr[js.Object] = js.undefined
  var keys: js.UndefOr[Anon_Value] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object Anon_Columns {
  @scala.inline
  def apply(
    columns: js.Array[PrimitiveArray] = null,
    done: () => _ = null,
    duration: Int | Double = null,
    json: js.Object = null,
    keys: Anon_Value = null,
    length: Int | Double = null,
    rows: js.Array[PrimitiveArray] = null,
    to: js.Any = null
  ): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_Columns]
  }
}

