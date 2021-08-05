package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNSTopicPublishAction extends StObject {
  
  /**
    * You can configure the action payload when you send a message as an Amazon SNS push notification.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * The ARN of the Amazon SNS target where the message is sent.
    */
  var targetArn: AmazonResourceName
}
object SNSTopicPublishAction {
  
  inline def apply(targetArn: AmazonResourceName): SNSTopicPublishAction = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSTopicPublishAction]
  }
  
  extension [Self <: SNSTopicPublishAction](x: Self) {
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setTargetArn(value: AmazonResourceName): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
