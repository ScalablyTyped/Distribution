package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsubscribeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  
  /**
    * The ARN of the SNS topic to unsubscribe from the notification rule.
    */
  var TargetAddress: typings.awsSdk.codestarnotificationsMod.TargetAddress = js.native
}
object UnsubscribeRequest {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn, TargetAddress: TargetAddress): UnsubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeRequest]
  }
  
  @scala.inline
  implicit class UnsubscribeRequestMutableBuilder[Self <: UnsubscribeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
  }
}
