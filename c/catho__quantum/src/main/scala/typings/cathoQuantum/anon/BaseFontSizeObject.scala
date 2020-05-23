package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFontSizeObject extends js.Object {
  var baseFontSize: js.UndefOr[js.Object] = js.undefined
}

object BaseFontSizeObject {
  @scala.inline
  def apply(baseFontSize: js.Object = null): BaseFontSizeObject = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFontSizeObject]
  }
}

