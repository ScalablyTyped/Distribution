package typings.backstopjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorColor extends js.Object {
  // See https://github.com/rsmbl/Resemble.js
  var errorColor: js.UndefOr[Anon_Blue] = js.undefined
  var errorType: js.UndefOr[String] = js.undefined
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined
  var transparency: js.UndefOr[Double] = js.undefined
}

object Anon_ErrorColor {
  @scala.inline
  def apply(
    errorColor: Anon_Blue = null,
    errorType: String = null,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    transparency: Int | Double = null
  ): Anon_ErrorColor = {
    val __obj = js.Dynamic.literal()
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor.asInstanceOf[js.Any])
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorColor]
  }
}

