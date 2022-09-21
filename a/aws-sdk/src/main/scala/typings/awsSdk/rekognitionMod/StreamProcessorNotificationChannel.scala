package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorNotificationChannel extends StObject {
  
  /**
    *  The Amazon Resource Number (ARN) of the Amazon Amazon Simple Notification Service topic to which Amazon Rekognition posts the completion status. 
    */
  var SNSTopicArn: typings.awsSdk.rekognitionMod.SNSTopicArn
}
object StreamProcessorNotificationChannel {
  
  inline def apply(SNSTopicArn: SNSTopicArn): StreamProcessorNotificationChannel = {
    val __obj = js.Dynamic.literal(SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessorNotificationChannel]
  }
  
  extension [Self <: StreamProcessorNotificationChannel](x: Self) {
    
    inline def setSNSTopicArn(value: SNSTopicArn): Self = StObject.set(x, "SNSTopicArn", value.asInstanceOf[js.Any])
  }
}
