package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassname extends js.Object {
  /** Class to assign to the chart's container SVG element. */
  var classname: js.UndefOr[String] = js.undefined
}

object AnonClassname {
  @scala.inline
  def apply(classname: String = null): AnonClassname = {
    val __obj = js.Dynamic.literal()
    if (classname != null) __obj.updateDynamic("classname")(classname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassname]
  }
}

