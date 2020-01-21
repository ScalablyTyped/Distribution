package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionConcurrencyResponse extends js.Object {
  /**
    * The number of simultaneous executions that are reserved for the function.
    */
  var ReservedConcurrentExecutions: js.UndefOr[typings.awsSdk.lambdaMod.ReservedConcurrentExecutions] = js.native
}

object GetFunctionConcurrencyResponse {
  @scala.inline
  def apply(ReservedConcurrentExecutions: Int | Double = null): GetFunctionConcurrencyResponse = {
    val __obj = js.Dynamic.literal()
    if (ReservedConcurrentExecutions != null) __obj.updateDynamic("ReservedConcurrentExecutions")(ReservedConcurrentExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionConcurrencyResponse]
  }
}

