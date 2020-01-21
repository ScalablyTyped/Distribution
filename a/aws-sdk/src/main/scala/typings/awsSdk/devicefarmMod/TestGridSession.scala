package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridSession extends js.Object {
  /**
    * The ARN of the session.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * The number of billed minutes that were used for this session. 
    */
  var billingMinutes: js.UndefOr[Double] = js.native
  /**
    * The time that the session was started.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * The time the session ended.
    */
  var ended: js.UndefOr[DateTime] = js.native
  /**
    * A JSON object of options and parameters passed to the Selenium WebDriver.
    */
  var seleniumProperties: js.UndefOr[String] = js.native
  /**
    * The state of the session.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.native
}

object TestGridSession {
  @scala.inline
  def apply(
    arn: DeviceFarmArn = null,
    billingMinutes: Int | scala.Double = null,
    created: DateTime = null,
    ended: DateTime = null,
    seleniumProperties: String = null,
    status: TestGridSessionStatus = null
  ): TestGridSession = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (billingMinutes != null) __obj.updateDynamic("billingMinutes")(billingMinutes.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ended != null) __obj.updateDynamic("ended")(ended.asInstanceOf[js.Any])
    if (seleniumProperties != null) __obj.updateDynamic("seleniumProperties")(seleniumProperties.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestGridSession]
  }
}

