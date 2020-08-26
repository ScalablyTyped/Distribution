package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateVariableResult extends js.Object {
  /**
    * Provides the errors for the BatchCreateVariable request.
    */
  var errors: js.UndefOr[BatchCreateVariableErrorList] = js.native
}

object BatchCreateVariableResult {
  @scala.inline
  def apply(): BatchCreateVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVariableResult]
  }
  @scala.inline
  implicit class BatchCreateVariableResultOps[Self <: BatchCreateVariableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorsVarargs(value: BatchCreateVariableError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchCreateVariableErrorList): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

