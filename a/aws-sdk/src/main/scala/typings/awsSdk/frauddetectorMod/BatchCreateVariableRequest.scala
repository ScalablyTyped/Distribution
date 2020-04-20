package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateVariableRequest extends js.Object {
  /**
    * The list of variables for the batch create variable request.
    */
  var variableEntries: VariableEntryList = js.native
}

object BatchCreateVariableRequest {
  @scala.inline
  def apply(variableEntries: VariableEntryList): BatchCreateVariableRequest = {
    val __obj = js.Dynamic.literal(variableEntries = variableEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVariableRequest]
  }
}

