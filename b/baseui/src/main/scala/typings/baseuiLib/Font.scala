package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontWeight: java.lang.String | scala.Double = null,
    lineHeight: java.lang.String | scala.Double = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

