package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def isFiltered(value: js.Any): Boolean
}

object Filter {
  @scala.inline
  def apply(isFiltered: js.Any => Boolean): Filter = {
    val __obj = js.Dynamic.literal(isFiltered = js.Any.fromFunction1(isFiltered))
  
    __obj.asInstanceOf[Filter]
  }
}

