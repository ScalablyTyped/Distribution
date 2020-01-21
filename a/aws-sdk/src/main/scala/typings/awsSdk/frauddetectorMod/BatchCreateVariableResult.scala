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
  def apply(errors: BatchCreateVariableErrorList = null): BatchCreateVariableResult = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVariableResult]
  }
}

