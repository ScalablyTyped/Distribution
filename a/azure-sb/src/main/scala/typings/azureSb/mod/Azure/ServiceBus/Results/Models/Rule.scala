package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends Base {
  var Action: String | SqlFilter
  var Filter: SqlFilter | CorrelationFilter
  var Name: String
  var RuleName: String
  var SubscriptionName: String
  var TopicName: String
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
}

