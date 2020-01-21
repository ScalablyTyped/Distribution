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
  def apply(errors: BatchGetVariableErrorList = null, variables: VariableList = null): BatchGetVariableResult = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetVariableResult]
  }
}

