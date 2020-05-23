package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsObject extends js.Object {
  var colors: js.UndefOr[js.Object] = js.undefined
}

object ColorsObject {
  @scala.inline
  def apply(colors: js.Object = null): ColorsObject = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsObject]
  }
}

