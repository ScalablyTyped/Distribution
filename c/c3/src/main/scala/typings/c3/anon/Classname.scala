package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classname extends js.Object {
  /** Class to assign to the chart's container SVG element. */
  var classname: js.UndefOr[String] = js.undefined
}

object Classname {
  @scala.inline
  def apply(classname: String = null): Classname = {
    val __obj = js.Dynamic.literal()
    if (classname != null) __obj.updateDynamic("classname")(classname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classname]
  }
}

