package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationRuleResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.undefined
}
object CreateNotificationRuleResult {
  
  @scala.inline
  def apply(): CreateNotificationRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationRuleResult]
  }
  
  @scala.inline
  implicit class CreateNotificationRuleResultMutableBuilder[Self <: CreateNotificationRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
