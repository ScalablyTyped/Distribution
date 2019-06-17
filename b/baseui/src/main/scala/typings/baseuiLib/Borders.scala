package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  var border100: js.UndefOr[Border] = js.undefined
  var border200: js.UndefOr[Border] = js.undefined
  var border300: js.UndefOr[Border] = js.undefined
  var border400: js.UndefOr[Border] = js.undefined
  var border500: js.UndefOr[Border] = js.undefined
  var border600: js.UndefOr[Border] = js.undefined
  var radius100: js.UndefOr[java.lang.String] = js.undefined
  var radius200: js.UndefOr[java.lang.String] = js.undefined
  var radius300: js.UndefOr[java.lang.String] = js.undefined
  var useRoundedCorners: js.UndefOr[scala.Boolean] = js.undefined
}

object Borders {
  @scala.inline
  def apply(
    border100: Border = null,
    border200: Border = null,
    border300: Border = null,
    border400: Border = null,
    border500: Border = null,
    border600: Border = null,
    radius100: java.lang.String = null,
    radius200: java.lang.String = null,
    radius300: java.lang.String = null,
    useRoundedCorners: js.UndefOr[scala.Boolean] = js.undefined
  ): Borders = {
    val __obj = js.Dynamic.literal()
    if (border100 != null) __obj.updateDynamic("border100")(border100)
    if (border200 != null) __obj.updateDynamic("border200")(border200)
    if (border300 != null) __obj.updateDynamic("border300")(border300)
    if (border400 != null) __obj.updateDynamic("border400")(border400)
    if (border500 != null) __obj.updateDynamic("border500")(border500)
    if (border600 != null) __obj.updateDynamic("border600")(border600)
    if (radius100 != null) __obj.updateDynamic("radius100")(radius100)
    if (radius200 != null) __obj.updateDynamic("radius200")(radius200)
    if (radius300 != null) __obj.updateDynamic("radius300")(radius300)
    if (!js.isUndefined(useRoundedCorners)) __obj.updateDynamic("useRoundedCorners")(useRoundedCorners)
    __obj.asInstanceOf[Borders]
  }
}

