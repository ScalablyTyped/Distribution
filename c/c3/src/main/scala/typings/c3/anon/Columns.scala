package typings.c3.anon

import typings.c3.mod.Primitive
import typings.c3.mod.PrimitiveArray
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `json` or `rows` are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.native
  /** Will be called when the flow ends. */
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  /** If given, the duration of the transition will be specified value. If not given, `transition.duration` will be used as default. */
  var duration: js.UndefOr[Double] = js.native
  /** An object to convert to data to load. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.native
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.native
  /** If given, the lower x edge will move by the number of this argument. */
  var length: js.UndefOr[Double] = js.native
  /** A list of rows, where the first row is the column names and the remaining rows are data. If this is provided and `json` is provided, this is ignored. */
  var rows: js.UndefOr[Array[js.Array[String] | PrimitiveArray]] = js.native
  /** If given, the lower x edge will move to that point. If not given, the lower x edge will move by the number of given data points. */
  var to: js.UndefOr[String | Double] = js.native
}

object Columns {
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: (Array[String | Primitive])*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Array[String | Primitive]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setJsonVarargs(value: (Record[String, Primitive])*): Self = this.set("json", js.Array(value :_*))
    @scala.inline
    def setJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setKeys(value: Value): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setRows(value: Array[js.Array[String] | PrimitiveArray]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTo(value: String | Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

