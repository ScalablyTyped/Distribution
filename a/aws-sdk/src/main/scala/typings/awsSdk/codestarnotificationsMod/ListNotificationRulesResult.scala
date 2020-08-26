package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotificationRulesResult extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
  /**
    * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID. 
    */
  var NotificationRules: js.UndefOr[NotificationRuleBatch] = js.native
}

object ListNotificationRulesResult {
  @scala.inline
  def apply(): ListNotificationRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationRulesResult]
  }
  @scala.inline
  implicit class ListNotificationRulesResultOps[Self <: ListNotificationRulesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setNotificationRulesVarargs(value: NotificationRuleSummary*): Self = this.set("NotificationRules", js.Array(value :_*))
    @scala.inline
    def setNotificationRules(value: NotificationRuleBatch): Self = this.set("NotificationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationRules: Self = this.set("NotificationRules", js.undefined)
  }
  
}

