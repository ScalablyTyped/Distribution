package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseValues extends js.Object {
  var expected: Boolean
  var subject: Boolean
}

object CaseValues {
  @scala.inline
  def apply(expected: Boolean, subject: Boolean): CaseValues = {
    val __obj = js.Dynamic.literal(expected = expected, subject = subject)
  
    __obj.asInstanceOf[CaseValues]
  }
}

