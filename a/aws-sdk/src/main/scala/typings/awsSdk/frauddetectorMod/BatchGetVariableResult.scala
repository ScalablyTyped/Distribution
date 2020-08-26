package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetVariableResult extends js.Object {
  /**
    * The errors from the request.
    */
  var errors: js.UndefOr[BatchGetVariableErrorList] = js.native
  /**
    * The returned variables.
    */
  var variables: js.UndefOr[VariableList] = js.native
}

object BatchGetVariableResult {
  @scala.inline
  def apply(): BatchGetVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetVariableResult]
  }
  @scala.inline
  implicit class BatchGetVariableResultOps[Self <: BatchGetVariableResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: BatchGetVariableError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchGetVariableErrorList): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: VariableList): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

