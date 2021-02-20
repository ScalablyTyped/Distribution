package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationRuleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
  
  /**
    * The unique ID of the notification rule.
    */
  var Id: js.UndefOr[NotificationRuleId] = js.native
}
object NotificationRuleSummary {
  
  @scala.inline
  def apply(): NotificationRuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationRuleSummary]
  }
  
  @scala.inline
  implicit class NotificationRuleSummaryMutableBuilder[Self <: NotificationRuleSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: NotificationRuleId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
