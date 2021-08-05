package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscribeResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the the notification rule from which you have removed a subscription.
    */
  var Arn: NotificationRuleArn
}
object UnsubscribeResult {
  
  inline def apply(Arn: NotificationRuleArn): UnsubscribeResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeResult]
  }
  
  extension [Self <: UnsubscribeResult](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
