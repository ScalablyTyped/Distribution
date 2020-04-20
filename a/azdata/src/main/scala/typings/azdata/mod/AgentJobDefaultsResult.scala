package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentJobDefaultsResult extends ResultStatus {
  var categories: js.Array[AgentJobCategory]
  var owner: String
}

object AgentJobDefaultsResult {
  @scala.inline
  def apply(categories: js.Array[AgentJobCategory], errorMessage: String, owner: String, success: Boolean): AgentJobDefaultsResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobDefaultsResult]
  }
}

