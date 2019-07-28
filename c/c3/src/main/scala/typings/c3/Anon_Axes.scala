package typings.c3

import org.scalablytyped.runtime.StringDictionary
import typings.c3.c3Mod.ArrayOrString
import typings.c3.c3Mod.PrimitiveArray
import typings.d3DashColor.d3DashColorMod.HSLColor
import typings.d3DashColor.d3DashColorMod.RGBColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axes extends js.Object {
  var axes: js.UndefOr[StringDictionary[String]] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var classes: js.UndefOr[StringDictionary[String]] = js.undefined
  var colors: js.UndefOr[StringDictionary[String | RGBColor | HSLColor]] = js.undefined
  var columns: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  var done: js.UndefOr[js.Function0[_]] = js.undefined
  var json: js.UndefOr[js.Object] = js.undefined
  var keys: js.UndefOr[Anon_Value] = js.undefined
  var names: js.UndefOr[StringDictionary[String]] = js.undefined
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[StringDictionary[String]] = js.undefined
  var unload: js.UndefOr[Boolean | ArrayOrString] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var xs: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Anon_Axes {
  @scala.inline
  def apply(
    axes: StringDictionary[String] = null,
    categories: js.Array[String] = null,
    classes: StringDictionary[String] = null,
    colors: StringDictionary[String | RGBColor | HSLColor] = null,
    columns: js.Array[PrimitiveArray] = null,
    done: () => _ = null,
    json: js.Object = null,
    keys: Anon_Value = null,
    names: StringDictionary[String] = null,
    rows: js.Array[PrimitiveArray] = null,
    `type`: String = null,
    types: StringDictionary[String] = null,
    unload: Boolean | ArrayOrString = null,
    url: String = null,
    xs: StringDictionary[String] = null
  ): Anon_Axes = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (json != null) __obj.updateDynamic("json")(json)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (names != null) __obj.updateDynamic("names")(names)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (types != null) __obj.updateDynamic("types")(types)
    if (unload != null) __obj.updateDynamic("unload")(unload.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (xs != null) __obj.updateDynamic("xs")(xs)
    __obj.asInstanceOf[Anon_Axes]
  }
}

