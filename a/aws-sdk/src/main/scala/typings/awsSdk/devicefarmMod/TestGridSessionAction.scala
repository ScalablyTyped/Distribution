package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridSessionAction extends js.Object {
  /**
    * The action taken by the session.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * The time, in milliseconds, that the action took to complete in the browser.
    */
  var duration: js.UndefOr[Long] = js.native
  /**
    * HTTP method that the browser used to make the request.
    */
  var requestMethod: js.UndefOr[String] = js.native
  /**
    * The time that the session invoked the action.
    */
  var started: js.UndefOr[DateTime] = js.native
  /**
    * HTTP status code returned to the browser when the action was taken.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object TestGridSessionAction {
  @scala.inline
  def apply(
    action: String = null,
    duration: js.UndefOr[Long] = js.undefined,
    requestMethod: String = null,
    started: DateTime = null,
    statusCode: String = null
  ): TestGridSessionAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (requestMethod != null) __obj.updateDynamic("requestMethod")(requestMethod.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestGridSessionAction]
  }
}

