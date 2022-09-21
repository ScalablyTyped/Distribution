package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChannel extends StObject {
  
  /**
    * The ARN of an IAM role that gives Amazon Rekognition publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typings.awsSdk.rekognitionMod.RoleArn
  
  /**
    * The Amazon SNS topic to which Amazon Rekognition posts the completion status.
    */
  var SNSTopicArn: typings.awsSdk.rekognitionMod.SNSTopicArn
}
object NotificationChannel {
  
  inline def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
  
  extension [Self <: NotificationChannel](x: Self) {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSNSTopicArn(value: SNSTopicArn): Self = StObject.set(x, "SNSTopicArn", value.asInstanceOf[js.Any])
  }
}
