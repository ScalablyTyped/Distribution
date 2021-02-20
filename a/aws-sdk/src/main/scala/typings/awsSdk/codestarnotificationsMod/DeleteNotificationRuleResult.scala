package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNotificationRuleResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
}
object DeleteNotificationRuleResult {
  
  @scala.inline
  def apply(): DeleteNotificationRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNotificationRuleResult]
  }
  
  @scala.inline
  implicit class DeleteNotificationRuleResultMutableBuilder[Self <: DeleteNotificationRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
