package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobDefaultsResult extends ResultStatus {
  var categories: js.Array[AgentJobCategory] = js.native
  var owner: String = js.native
}

object AgentJobDefaultsResult {
  @scala.inline
  def apply(categories: js.Array[AgentJobCategory], errorMessage: String, owner: String, success: Boolean): AgentJobDefaultsResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobDefaultsResult]
  }
  @scala.inline
  implicit class AgentJobDefaultsResultOps[Self <: AgentJobDefaultsResult] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: AgentJobCategory*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[AgentJobCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
  }
  
}

