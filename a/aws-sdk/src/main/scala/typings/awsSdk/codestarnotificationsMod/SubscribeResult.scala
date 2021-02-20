package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you have created assocations.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
}
object SubscribeResult {
  
  @scala.inline
  def apply(): SubscribeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeResult]
  }
  
  @scala.inline
  implicit class SubscribeResultMutableBuilder[Self <: SubscribeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
