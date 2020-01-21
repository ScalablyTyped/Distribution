package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotificationRulesFilter extends js.Object {
  /**
    * The name of the attribute you want to use to filter the returned notification rules.
    */
  var Name: ListNotificationRulesFilterName = js.native
  /**
    * The value of the attribute you want to use to filter the returned notification rules. For example, if you specify filtering by RESOURCE in Name, you might specify the ARN of a pipeline in AWS CodePipeline for the value.
    */
  var Value: ListNotificationRulesFilterValue = js.native
}

object ListNotificationRulesFilter {
  @scala.inline
  def apply(Name: ListNotificationRulesFilterName, Value: ListNotificationRulesFilterValue): ListNotificationRulesFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListNotificationRulesFilter]
  }
}

