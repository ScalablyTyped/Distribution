package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalData extends js.Object {
  var _result: js.Any
}

object GlobalData {
  @scala.inline
  def apply(_result: js.Any): GlobalData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_result")(_result)
    __obj.asInstanceOf[GlobalData]
  }
}

