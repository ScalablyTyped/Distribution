package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseValues extends js.Object {
  var expected: scala.Boolean
  var subject: scala.Boolean
}

object CaseValues {
  @scala.inline
  def apply(expected: scala.Boolean, subject: scala.Boolean): CaseValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[CaseValues]
  }
}

