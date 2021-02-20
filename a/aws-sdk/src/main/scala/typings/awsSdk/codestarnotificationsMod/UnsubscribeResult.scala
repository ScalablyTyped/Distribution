package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsubscribeResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the the notification rule from which you have removed a subscription.
    */
  var Arn: NotificationRuleArn = js.native
}
object UnsubscribeResult {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn): UnsubscribeResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeResult]
  }
  
  @scala.inline
  implicit class UnsubscribeResultMutableBuilder[Self <: UnsubscribeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
