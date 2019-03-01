package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def isFiltered(value: js.Any): scala.Boolean
}

object Filter {
  @scala.inline
  def apply(isFiltered: js.Function1[js.Any, scala.Boolean]): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isFiltered")(isFiltered)
    __obj.asInstanceOf[Filter]
  }
}

