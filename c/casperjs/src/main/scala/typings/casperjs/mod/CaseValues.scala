package typings.casperjs.mod

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
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseValues]
  }
}

