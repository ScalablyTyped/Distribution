package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Problem extends js.Object {
  /**
    * Information about the associated device.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * Information about the associated job.
    */
  var job: js.UndefOr[ProblemDetail] = js.native
  /**
    * A message about the problem's result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The problem's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  /**
    * Information about the associated run.
    */
  var run: js.UndefOr[ProblemDetail] = js.native
  /**
    * Information about the associated suite.
    */
  var suite: js.UndefOr[ProblemDetail] = js.native
  /**
    * Information about the associated test.
    */
  var test: js.UndefOr[ProblemDetail] = js.native
}

object Problem {
  @scala.inline
  def apply(
    device: Device = null,
    job: ProblemDetail = null,
    message: Message = null,
    result: ExecutionResult = null,
    run: ProblemDetail = null,
    suite: ProblemDetail = null,
    test: ProblemDetail = null
  ): Problem = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    if (suite != null) __obj.updateDynamic("suite")(suite.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Problem]
  }
}

