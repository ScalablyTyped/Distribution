package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestWindowSummary extends js.Object {
  /**
    * If the test failed, the reason why it failed.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The status of the test. Possible status values are:    ACTIVE     CREATE_IN_PROGRESS     CREATE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The time at which the test ended.
    */
  var TestWindowEnd: js.UndefOr[Timestamp] = js.native
  /**
    * The time at which the test began.
    */
  var TestWindowStart: js.UndefOr[Timestamp] = js.native
}

object TestWindowSummary {
  @scala.inline
  def apply(): TestWindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestWindowSummary]
  }
  @scala.inline
  implicit class TestWindowSummaryOps[Self <: TestWindowSummary] (val x: Self) extends AnyVal {
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
    def setMessage(value: ErrorMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTestWindowEnd(value: Timestamp): Self = this.set("TestWindowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestWindowEnd: Self = this.set("TestWindowEnd", js.undefined)
    @scala.inline
    def setTestWindowStart(value: Timestamp): Self = this.set("TestWindowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestWindowStart: Self = this.set("TestWindowStart", js.undefined)
  }
  
}

