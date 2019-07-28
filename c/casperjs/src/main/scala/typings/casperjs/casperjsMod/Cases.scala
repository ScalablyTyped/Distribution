package typings.casperjs.casperjsMod

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
    val __obj = js.Dynamic.literal(cases = cases, length = length)
  
    __obj.asInstanceOf[Cases]
  }
}

