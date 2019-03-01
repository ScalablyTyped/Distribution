package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberDisplayWidgetHTML extends js.Object {
  var none: java.lang.String
  var one: java.lang.String
  var some: java.lang.String
}

object NumberDisplayWidgetHTML {
  @scala.inline
  def apply(none: java.lang.String, one: java.lang.String, some: java.lang.String): NumberDisplayWidgetHTML = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("one")(one)
    __obj.updateDynamic("some")(some)
    __obj.asInstanceOf[NumberDisplayWidgetHTML]
  }
}

