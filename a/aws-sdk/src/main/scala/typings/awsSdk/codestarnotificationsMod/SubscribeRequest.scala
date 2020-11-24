package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeRequest extends js.Object {
  
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
  implicit class SubscribeRequestOps[Self <: SubscribeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
  }
}
