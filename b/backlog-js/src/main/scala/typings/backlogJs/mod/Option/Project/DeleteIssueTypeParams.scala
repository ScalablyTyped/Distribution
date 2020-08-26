package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIssueTypeParams extends js.Object {
  var substituteIssueTypeId: Double = js.native
}

object DeleteIssueTypeParams {
  @scala.inline
  def apply(substituteIssueTypeId: Double): DeleteIssueTypeParams = {
    val __obj = js.Dynamic.literal(substituteIssueTypeId = substituteIssueTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIssueTypeParams]
  }
  @scala.inline
  implicit class DeleteIssueTypeParamsOps[Self <: DeleteIssueTypeParams] (val x: Self) extends AnyVal {
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
    def setSubstituteIssueTypeId(value: Double): Self = this.set("substituteIssueTypeId", value.asInstanceOf[js.Any])
  }
  
}

