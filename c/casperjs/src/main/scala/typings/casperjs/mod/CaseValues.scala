package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseValues extends js.Object {
  var expected: Boolean = js.native
  var subject: Boolean = js.native
}

object CaseValues {
  @scala.inline
  def apply(expected: Boolean, subject: Boolean): CaseValues = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseValues]
  }
  @scala.inline
  implicit class CaseValuesOps[Self <: CaseValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpected(value: Boolean): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Boolean): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

