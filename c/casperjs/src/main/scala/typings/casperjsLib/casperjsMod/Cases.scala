package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cases extends js.Object {
  var cases: js.Array[Case]
  var length: scala.Double
}

object Cases {
  @scala.inline
  def apply(cases: js.Array[Case], length: scala.Double): Cases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cases")(cases)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[Cases]
  }
}

