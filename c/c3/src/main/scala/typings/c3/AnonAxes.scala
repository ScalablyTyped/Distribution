package typings.c3

import typings.c3.c3Booleans.`true`
import typings.c3.mod.ArrayOrString
import typings.c3.mod.AxisName
import typings.c3.mod.Data
import typings.c3.mod.Primitive
import typings.c3.mod.PrimitiveArray
import typings.d3Color.mod.HSLColor
import typings.d3Color.mod.RGBColor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxes extends js.Object {
  /** Match data IDs to their axes. */
  var axes: js.UndefOr[Record[String, AxisName]] = js.undefined
  /** Array of arrays of data IDs. IDs that share a sub-array will be categorized together. */
  var categories: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /** If classes given, the classes specifed by `data.classes` will be updated. Keys should be data IDs and values should be classes to assign. */
  var classes: js.UndefOr[Record[String, String]] = js.undefined
  /** Match data IDs to the colors to render that data as. */
  var colors: js.UndefOr[Record[String, String | RGBColor | HSLColor]] = js.undefined
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `data`, `url`, `json`, or 'rows' are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.undefined
  /** Data to load. */
  var data: js.UndefOr[Data] = js.undefined
  /** Called when loading completes. */
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * An object to convert to data to load. Can be in the column form
    * (`{key1: [val1, val2, ...]; ...}`) or in the row form (`[{key1: val1; key2: val2}, ...]`).
    * If `data` or `url` are provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.undefined
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[AnonValue] = js.undefined
  /** Match loaded data IDs with display names. */
  var names: js.UndefOr[Record[String, String]] = js.undefined
  /** A list of rows, where the first row is the column names and the remaining rows are data.  If `data`, `url`, or `json` are provided this will be ignored.  */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  /** Select the plot type for the loaded data. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Select the plot types for each individual data by ID. */
  var types: js.UndefOr[Record[String, String]] = js.undefined
  /** ID of data to remove, or list of IDs of data to remove, or `true` to remove all data. */
  var unload: js.UndefOr[`true` | ArrayOrString] = js.undefined
  /** API url to load data from. If `data` is provided this will be ignored. */
  var url: js.UndefOr[String] = js.undefined
  /** Match x columns to the corresponding data columns. */
  var xs: js.UndefOr[Record[String, String]] = js.undefined
}

object AnonAxes {
  @scala.inline
  def apply(
    axes: Record[String, AxisName] = null,
    categories: js.Array[js.Array[String]] = null,
    classes: Record[String, String] = null,
    colors: Record[String, String | RGBColor | HSLColor] = null,
    columns: js.Array[Array[String | Primitive]] = null,
    data: Data = null,
    done: () => Unit = null,
    json: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]]) = null,
    keys: AnonValue = null,
    names: Record[String, String] = null,
    rows: js.Array[PrimitiveArray] = null,
    `type`: String = null,
    types: Record[String, String] = null,
    unload: `true` | ArrayOrString = null,
    url: String = null,
    xs: Record[String, String] = null
  ): AnonAxes = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (unload != null) __obj.updateDynamic("unload")(unload.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxes]
  }
}

