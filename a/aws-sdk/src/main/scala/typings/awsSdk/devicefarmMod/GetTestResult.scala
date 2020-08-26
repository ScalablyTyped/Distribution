package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestResult extends js.Object {
  /**
    * A test condition that is evaluated.
    */
  var test: js.UndefOr[Test] = js.native
}

object GetTestResult {
  @scala.inline
  def apply(): GetTestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestResult]
  }
  @scala.inline
  implicit class GetTestResultOps[Self <: GetTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTest(value: Test): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
  
}

