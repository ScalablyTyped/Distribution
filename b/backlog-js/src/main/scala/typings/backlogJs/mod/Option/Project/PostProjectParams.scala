package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProjectParams extends js.Object {
  var chartEnabled: Boolean = js.native
  var key: String = js.native
  var name: String = js.native
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.native
  var subtaskingEnabled: Boolean = js.native
  var textFormattingRule: TextFormattingRule = js.native
}

object PostProjectParams {
  @scala.inline
  def apply(
    chartEnabled: Boolean,
    key: String,
    name: String,
    subtaskingEnabled: Boolean,
    textFormattingRule: TextFormattingRule
  ): PostProjectParams = {
    val __obj = js.Dynamic.literal(chartEnabled = chartEnabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtaskingEnabled = subtaskingEnabled.asInstanceOf[js.Any], textFormattingRule = textFormattingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProjectParams]
  }
  @scala.inline
  implicit class PostProjectParamsOps[Self <: PostProjectParams] (val x: Self) extends AnyVal {
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
    def setChartEnabled(value: Boolean): Self = this.set("chartEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtaskingEnabled(value: Boolean): Self = this.set("subtaskingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextFormattingRule(value: TextFormattingRule): Self = this.set("textFormattingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectLeaderCanEditProjectLeader(value: Boolean): Self = this.set("projectLeaderCanEditProjectLeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectLeaderCanEditProjectLeader: Self = this.set("projectLeaderCanEditProjectLeader", js.undefined)
  }
  
}

