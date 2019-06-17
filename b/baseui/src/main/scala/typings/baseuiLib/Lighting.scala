package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lighting extends js.Object {
  var overlay0: js.UndefOr[java.lang.String] = js.undefined
  var overlay100: js.UndefOr[java.lang.String] = js.undefined
  var overlay200: js.UndefOr[java.lang.String] = js.undefined
  var overlay300: js.UndefOr[java.lang.String] = js.undefined
  var overlay400: js.UndefOr[java.lang.String] = js.undefined
  var overlay500: js.UndefOr[java.lang.String] = js.undefined
  var overlay600: js.UndefOr[java.lang.String] = js.undefined
  var shadow400: js.UndefOr[java.lang.String] = js.undefined
  var shadow500: js.UndefOr[java.lang.String] = js.undefined
  var shadow600: js.UndefOr[java.lang.String] = js.undefined
  var shadow700: js.UndefOr[java.lang.String] = js.undefined
}

object Lighting {
  @scala.inline
  def apply(
    overlay0: java.lang.String = null,
    overlay100: java.lang.String = null,
    overlay200: java.lang.String = null,
    overlay300: java.lang.String = null,
    overlay400: java.lang.String = null,
    overlay500: java.lang.String = null,
    overlay600: java.lang.String = null,
    shadow400: java.lang.String = null,
    shadow500: java.lang.String = null,
    shadow600: java.lang.String = null,
    shadow700: java.lang.String = null
  ): Lighting = {
    val __obj = js.Dynamic.literal()
    if (overlay0 != null) __obj.updateDynamic("overlay0")(overlay0)
    if (overlay100 != null) __obj.updateDynamic("overlay100")(overlay100)
    if (overlay200 != null) __obj.updateDynamic("overlay200")(overlay200)
    if (overlay300 != null) __obj.updateDynamic("overlay300")(overlay300)
    if (overlay400 != null) __obj.updateDynamic("overlay400")(overlay400)
    if (overlay500 != null) __obj.updateDynamic("overlay500")(overlay500)
    if (overlay600 != null) __obj.updateDynamic("overlay600")(overlay600)
    if (shadow400 != null) __obj.updateDynamic("shadow400")(shadow400)
    if (shadow500 != null) __obj.updateDynamic("shadow500")(shadow500)
    if (shadow600 != null) __obj.updateDynamic("shadow600")(shadow600)
    if (shadow700 != null) __obj.updateDynamic("shadow700")(shadow700)
    __obj.asInstanceOf[Lighting]
  }
}

