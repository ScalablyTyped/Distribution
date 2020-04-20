package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cases extends js.Object {
  var cases: js.Array[Case]
  var length: Double
}

object Cases {
  @scala.inline
  def apply(cases: js.Array[Case], length: Double): Cases = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cases]
  }
}

