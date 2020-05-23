package typings.c3.anon

import typings.c3.mod.Primitive
import typings.c3.mod.PrimitiveArray
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `json` or `rows` are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.undefined
  /** Will be called when the flow ends. */
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** If given, the duration of the transition will be specified value. If not given, `transition.duration` will be used as default. */
  var duration: js.UndefOr[Double] = js.undefined
  /** An object to convert to data to load. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.undefined
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.undefined
  /** If given, the lower x edge will move by the number of this argument. */
  var length: js.UndefOr[Double] = js.undefined
  /** A list of rows, where the first row is the column names and the remaining rows are data. If this is provided and `json` is provided, this is ignored. */
  var rows: js.UndefOr[Array[js.Array[String] | PrimitiveArray]] = js.undefined
  /** If given, the lower x edge will move to that point. If not given, the lower x edge will move by the number of given data points. */
  var to: js.UndefOr[String | Double] = js.undefined
}

object Columns {
  @scala.inline
  def apply(
    columns: js.Array[Array[String | Primitive]] = null,
    done: () => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    json: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]]) = null,
    keys: Value = null,
    length: js.UndefOr[Double] = js.undefined,
    rows: Array[js.Array[String] | PrimitiveArray] = null,
    to: String | Double = null
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

