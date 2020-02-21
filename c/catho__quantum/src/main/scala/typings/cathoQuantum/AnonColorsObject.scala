package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsObject extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
}

object AnonColorsObject {
  @scala.inline
  def apply(colors: js.Object = null): AnonColorsObject = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsObject]
  }
}

