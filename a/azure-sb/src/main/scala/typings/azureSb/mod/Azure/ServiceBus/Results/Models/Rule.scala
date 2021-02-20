package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String | SqlFilter): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: SqlFilter | CorrelationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
