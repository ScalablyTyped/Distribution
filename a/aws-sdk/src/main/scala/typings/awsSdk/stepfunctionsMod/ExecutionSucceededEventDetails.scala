package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionSucceededEventDetails extends js.Object {
  /**
    * The JSON data output by the execution.
    */
  var output: js.UndefOr[SensitiveData] = js.native
}

object ExecutionSucceededEventDetails {
  @scala.inline
  def apply(output: SensitiveData = null): ExecutionSucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionSucceededEventDetails]
  }
}

