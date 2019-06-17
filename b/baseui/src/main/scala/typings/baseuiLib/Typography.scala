package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var font100: js.UndefOr[Font] = js.undefined
  var font1000: js.UndefOr[Font] = js.undefined
  var font200: js.UndefOr[Font] = js.undefined
  var font250: js.UndefOr[Font] = js.undefined
  var font300: js.UndefOr[Font] = js.undefined
  var font350: js.UndefOr[Font] = js.undefined
  var font400: js.UndefOr[Font] = js.undefined
  var font450: js.UndefOr[Font] = js.undefined
  var font500: js.UndefOr[Font] = js.undefined
  var font600: js.UndefOr[Font] = js.undefined
  var font700: js.UndefOr[Font] = js.undefined
  var font800: js.UndefOr[Font] = js.undefined
  var font900: js.UndefOr[Font] = js.undefined
}

object Typography {
  @scala.inline
  def apply(
    font100: Font = null,
    font1000: Font = null,
    font200: Font = null,
    font250: Font = null,
    font300: Font = null,
    font350: Font = null,
    font400: Font = null,
    font450: Font = null,
    font500: Font = null,
    font600: Font = null,
    font700: Font = null,
    font800: Font = null,
    font900: Font = null
  ): Typography = {
    val __obj = js.Dynamic.literal()
    if (font100 != null) __obj.updateDynamic("font100")(font100)
    if (font1000 != null) __obj.updateDynamic("font1000")(font1000)
    if (font200 != null) __obj.updateDynamic("font200")(font200)
    if (font250 != null) __obj.updateDynamic("font250")(font250)
    if (font300 != null) __obj.updateDynamic("font300")(font300)
    if (font350 != null) __obj.updateDynamic("font350")(font350)
    if (font400 != null) __obj.updateDynamic("font400")(font400)
    if (font450 != null) __obj.updateDynamic("font450")(font450)
    if (font500 != null) __obj.updateDynamic("font500")(font500)
    if (font600 != null) __obj.updateDynamic("font600")(font600)
    if (font700 != null) __obj.updateDynamic("font700")(font700)
    if (font800 != null) __obj.updateDynamic("font800")(font800)
    if (font900 != null) __obj.updateDynamic("font900")(font900)
    __obj.asInstanceOf[Typography]
  }
}

