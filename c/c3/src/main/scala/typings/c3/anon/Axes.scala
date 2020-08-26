package typings.c3.anon

import typings.c3.c3Booleans.`true`
import typings.c3.mod.ArrayOrString
import typings.c3.mod.AxisName
import typings.c3.mod.Primitive
import typings.c3.mod.PrimitiveArray
import typings.d3Color.mod.HSLColor
import typings.d3Color.mod.RGBColor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes extends js.Object {
  /** Match data IDs to their axes. */
  var axes: js.UndefOr[Record[String, AxisName]] = js.native
  /** Array of arrays of data IDs. IDs that share a sub-array will be categorized together. */
  var categories: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /** If classes given, the classes specifed by `data.classes` will be updated. Keys should be data IDs and values should be classes to assign. */
  var classes: js.UndefOr[Record[String, String]] = js.native
  /** Match data IDs to the colors to render that data as. */
  var colors: js.UndefOr[Record[String, String | RGBColor | HSLColor]] = js.native
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `data`, `url`, `json`, or 'rows' are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.native
  /** Data to load. */
  var data: js.UndefOr[typings.c3.mod.Data] = js.native
  /** Called when loading completes. */
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An object to convert to data to load. Can be in the column form
    * (`{key1: [val1, val2, ...]; ...}`) or in the row form (`[{key1: val1; key2: val2}, ...]`).
    * If `data` or `url` are provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.native
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.native
  /** Match loaded data IDs with display names. */
  var names: js.UndefOr[Record[String, String]] = js.native
  /** A list of rows, where the first row is the column names and the remaining rows are data.  If `data`, `url`, or `json` are provided this will be ignored.  */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.native
  /** Select the plot type for the loaded data. */
  var `type`: js.UndefOr[String] = js.native
  /** Select the plot types for each individual data by ID. */
  var types: js.UndefOr[Record[String, String]] = js.native
  /** ID of data to remove, or list of IDs of data to remove, or `true` to remove all data. */
  var unload: js.UndefOr[`true` | ArrayOrString] = js.native
  /** API url to load data from. If `data` is provided this will be ignored. */
  var url: js.UndefOr[String] = js.native
  /** Match x columns to the corresponding data columns. */
  var xs: js.UndefOr[Record[String, String]] = js.native
}

object Axes {
  @scala.inline
  def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  @scala.inline
  implicit class AxesOps[Self <: Axes] (val x: Self) extends AnyVal {
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
    def setAxes(value: Record[String, AxisName]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: js.Array[String]*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[js.Array[String]]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setClasses(value: Record[String, String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setColors(value: Record[String, String | RGBColor | HSLColor]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: (Array[String | Primitive])*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Array[String | Primitive]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setData(value: typings.c3.mod.Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
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
    def setNames(value: Record[String, String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setRowsVarargs(value: PrimitiveArray*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[PrimitiveArray]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypes(value: Record[String, String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setUnloadVarargs(value: String*): Self = this.set("unload", js.Array(value :_*))
    @scala.inline
    def setUnload(value: `true` | ArrayOrString): Self = this.set("unload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnload: Self = this.set("unload", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXs(value: Record[String, String]): Self = this.set("xs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
  }
  
}

