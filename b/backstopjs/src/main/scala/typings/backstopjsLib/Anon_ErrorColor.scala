package typings
package backstopjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorColor extends js.Object {
  // See https://github.com/rsmbl/Resemble.js
  var errorColor: js.UndefOr[Anon_Blue] = js.undefined
  var errorType: js.UndefOr[java.lang.String] = js.undefined
  var ignoreAntialiasing: js.UndefOr[scala.Boolean] = js.undefined
  var transparency: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ErrorColor {
  @scala.inline
  def apply(
    errorColor: Anon_Blue = null,
    errorType: java.lang.String = null,
    ignoreAntialiasing: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: scala.Int | scala.Double = null
  ): Anon_ErrorColor = {
    val __obj = js.Dynamic.literal()
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor)
    if (errorType != null) __obj.updateDynamic("errorType")(errorType)
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorColor]
  }
}

