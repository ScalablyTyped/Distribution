package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotificationRulesResult extends StObject {
  
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
  implicit class ListNotificationRulesResultMutableBuilder[Self <: ListNotificationRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotificationRules(value: NotificationRuleBatch): Self = StObject.set(x, "NotificationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationRulesUndefined: Self = StObject.set(x, "NotificationRules", js.undefined)
    
    @scala.inline
    def setNotificationRulesVarargs(value: NotificationRuleSummary*): Self = StObject.set(x, "NotificationRules", js.Array(value :_*))
  }
}
