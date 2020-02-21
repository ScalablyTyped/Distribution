package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseFontSizeObject extends js.Object {
  var baseFontSize: js.UndefOr[js.Object] = js.undefined
}

object AnonBaseFontSizeObject {
  @scala.inline
  def apply(baseFontSize: js.Object = null): AnonBaseFontSizeObject = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseFontSizeObject]
  }
}

