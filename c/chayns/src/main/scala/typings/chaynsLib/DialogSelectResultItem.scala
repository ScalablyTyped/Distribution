package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectResultItem extends js.Object {
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DialogSelectResultItem {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String = null): DialogSelectResultItem = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DialogSelectResultItem]
  }
}

