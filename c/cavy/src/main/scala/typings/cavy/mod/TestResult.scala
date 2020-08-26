package typings.cavy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  var message: String = js.native
  var passed: Boolean = js.native
}

object TestResult {
  @scala.inline
  def apply(message: String, passed: Boolean): TestResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
  }
  
}

