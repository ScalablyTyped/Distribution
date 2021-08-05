package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationRuleResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.undefined
}
object DeleteNotificationRuleResult {
  
  inline def apply(): DeleteNotificationRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNotificationRuleResult]
  }
  
  extension [Self <: DeleteNotificationRuleResult](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
