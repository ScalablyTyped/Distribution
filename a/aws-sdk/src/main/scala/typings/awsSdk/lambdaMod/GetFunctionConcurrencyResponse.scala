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
  def apply(): GetFunctionConcurrencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionConcurrencyResponse]
  }
  @scala.inline
  implicit class GetFunctionConcurrencyResponseOps[Self <: GetFunctionConcurrencyResponse] (val x: Self) extends AnyVal {
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
    def setReservedConcurrentExecutions(value: ReservedConcurrentExecutions): Self = this.set("ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedConcurrentExecutions: Self = this.set("ReservedConcurrentExecutions", js.undefined)
  }
  
}

