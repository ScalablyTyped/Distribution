package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends Base {
  var Action: String | SqlFilter = js.native
  var Filter: SqlFilter | CorrelationFilter = js.native
  var Name: String = js.native
  var RuleName: String = js.native
  var SubscriptionName: String = js.native
  var TopicName: String = js.native
}

object Rule {
  @scala.inline
  def apply(
    Action: String | SqlFilter,
    CreatedAt: DateString,
    Filter: SqlFilter | CorrelationFilter,
    Name: String,
    RuleName: String,
    SubscriptionName: String,
    TopicName: String,
    _underscore: Author
  ): Rule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
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
    def setAction(value: String | SqlFilter): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: SqlFilter | CorrelationFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: String): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionName(value: String): Self = this.set("SubscriptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicName(value: String): Self = this.set("TopicName", value.asInstanceOf[js.Any])
  }
  
}

