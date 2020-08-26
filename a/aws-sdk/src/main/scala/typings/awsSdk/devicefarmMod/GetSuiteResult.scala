package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuiteResult extends js.Object {
  /**
    * A collection of one or more tests.
    */
  var suite: js.UndefOr[Suite] = js.native
}

object GetSuiteResult {
  @scala.inline
  def apply(): GetSuiteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSuiteResult]
  }
  @scala.inline
  implicit class GetSuiteResultOps[Self <: GetSuiteResult] (val x: Self) extends AnyVal {
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
    def setSuite(value: Suite): Self = this.set("suite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuite: Self = this.set("suite", js.undefined)
  }
  
}

