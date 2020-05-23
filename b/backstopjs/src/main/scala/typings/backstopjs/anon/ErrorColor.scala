package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorColor extends js.Object {
  // See https://github.com/rsmbl/Resemble.js
  var errorColor: js.UndefOr[Blue] = js.undefined
  var errorType: js.UndefOr[String] = js.undefined
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined
  var transparency: js.UndefOr[Double] = js.undefined
}

object ErrorColor {
  @scala.inline
  def apply(
    errorColor: Blue = null,
    errorType: String = null,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    transparency: js.UndefOr[Double] = js.undefined
  ): ErrorColor = {
    val __obj = js.Dynamic.literal()
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor.asInstanceOf[js.Any])
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorColor]
  }
}

