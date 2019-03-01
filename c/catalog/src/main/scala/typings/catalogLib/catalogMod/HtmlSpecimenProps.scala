package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlSpecimenProps extends js.Object {
  var children: java.lang.String
  var dark: js.UndefOr[scala.Boolean] = js.undefined
  var frame: js.UndefOr[scala.Boolean] = js.undefined
  var light: js.UndefOr[scala.Boolean] = js.undefined
  var noSource: js.UndefOr[scala.Boolean] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  var showSource: js.UndefOr[scala.Boolean] = js.undefined
}

object HtmlSpecimenProps {
  @scala.inline
  def apply(
    children: java.lang.String,
    dark: js.UndefOr[scala.Boolean] = js.undefined,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    light: js.UndefOr[scala.Boolean] = js.undefined,
    noSource: js.UndefOr[scala.Boolean] = js.undefined,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    showSource: js.UndefOr[scala.Boolean] = js.undefined
  ): HtmlSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSource)) __obj.updateDynamic("showSource")(showSource)
    __obj.asInstanceOf[HtmlSpecimenProps]
  }
}

