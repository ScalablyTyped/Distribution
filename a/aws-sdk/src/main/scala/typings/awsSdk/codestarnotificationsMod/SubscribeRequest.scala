package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
    */
  var Arn: NotificationRuleArn = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ClientRequestToken] = js.native
  
  var Target: typings.awsSdk.codestarnotificationsMod.Target = js.native
}
object SubscribeRequest {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn, Target: Target): SubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeRequest]
  }
  
  @scala.inline
  implicit class SubscribeRequestMutableBuilder[Self <: SubscribeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
