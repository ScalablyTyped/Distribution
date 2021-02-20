package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SNSTopicPublishAction extends StObject {
  
  /**
    * You can configure the action payload when you send a message as an Amazon SNS push notification.
    */
  var payload: js.UndefOr[Payload] = js.native
  
  /**
    * The ARN of the Amazon SNS target where the message is sent.
    */
  var targetArn: AmazonResourceName = js.native
}
object SNSTopicPublishAction {
  
  @scala.inline
  def apply(targetArn: AmazonResourceName): SNSTopicPublishAction = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSTopicPublishAction]
  }
  
  @scala.inline
  implicit class SNSTopicPublishActionMutableBuilder[Self <: SNSTopicPublishAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setTargetArn(value: AmazonResourceName): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
