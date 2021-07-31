package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationRuleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn
}
object DescribeNotificationRuleRequest {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn): DescribeNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleRequest]
  }
  
  @scala.inline
  implicit class DescribeNotificationRuleRequestMutableBuilder[Self <: DescribeNotificationRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
