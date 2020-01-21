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
  def apply(
    Message: ErrorMessage = null,
    Status: Status = null,
    TestWindowEnd: Timestamp = null,
    TestWindowStart: Timestamp = null
  ): TestWindowSummary = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TestWindowEnd != null) __obj.updateDynamic("TestWindowEnd")(TestWindowEnd.asInstanceOf[js.Any])
    if (TestWindowStart != null) __obj.updateDynamic("TestWindowStart")(TestWindowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestWindowSummary]
  }
}

