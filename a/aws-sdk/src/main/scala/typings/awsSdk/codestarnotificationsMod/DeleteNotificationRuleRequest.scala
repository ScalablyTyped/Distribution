package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNotificationRuleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule you want to delete.
    */
  var Arn: NotificationRuleArn = js.native
}
object DeleteNotificationRuleRequest {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn): DeleteNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteNotificationRuleRequestMutableBuilder[Self <: DeleteNotificationRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
