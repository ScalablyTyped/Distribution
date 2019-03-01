package typings
package babelDashTraverseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confident extends js.Object {
  var confident: scala.Boolean
  var value: js.Any
}

object Anon_Confident {
  @scala.inline
  def apply(confident: scala.Boolean, value: js.Any): Anon_Confident = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confident")(confident)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Confident]
  }
}

