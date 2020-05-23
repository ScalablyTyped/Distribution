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
  def apply(ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined): GetFunctionConcurrencyResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReservedConcurrentExecutions)) __obj.updateDynamic("ReservedConcurrentExecutions")(ReservedConcurrentExecutions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionConcurrencyResponse]
  }
}

