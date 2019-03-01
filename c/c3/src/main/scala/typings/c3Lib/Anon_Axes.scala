package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axes extends js.Object {
  var axes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var classes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var colors: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor]
  ] = js.undefined
  var columns: js.UndefOr[js.Array[c3Lib.c3Mod.PrimitiveArray]] = js.undefined
  var done: js.UndefOr[js.Function0[_]] = js.undefined
  var json: js.UndefOr[js.Object] = js.undefined
  var keys: js.UndefOr[Anon_Value] = js.undefined
  var names: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var rows: js.UndefOr[js.Array[c3Lib.c3Mod.PrimitiveArray]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var unload: js.UndefOr[scala.Boolean | c3Lib.c3Mod.ArrayOrString] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var xs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Anon_Axes {
  @scala.inline
  def apply(
    axes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    categories: js.Array[java.lang.String] = null,
    classes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    colors: org.scalablytyped.runtime.StringDictionary[java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor] = null,
    columns: js.Array[c3Lib.c3Mod.PrimitiveArray] = null,
    done: js.Function0[_] = null,
    json: js.Object = null,
    keys: Anon_Value = null,
    names: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    rows: js.Array[c3Lib.c3Mod.PrimitiveArray] = null,
    `type`: java.lang.String = null,
    types: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    unload: scala.Boolean | c3Lib.c3Mod.ArrayOrString = null,
    url: java.lang.String = null,
    xs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Axes = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (done != null) __obj.updateDynamic("done")(done)
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

