package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationLogsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role with permission to write to your CloudWatch Logs for text logs and your S3 bucket for audio logs. If audio encryption is enabled, this role also provides access permission for the AWS KMS key used for encrypting audio logs. For more information, see Creating an IAM Role and Policy for Conversation Logs.
    */
  var iamRoleArn: IamRoleArn
  
  /**
    * The settings for your conversation logs. You can log the conversation text, conversation audio, or both.
    */
  var logSettings: LogSettingsRequestList
}
object ConversationLogsRequest {
  
  inline def apply(iamRoleArn: IamRoleArn, logSettings: LogSettingsRequestList): ConversationLogsRequest = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], logSettings = logSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationLogsRequest]
  }
  
  extension [Self <: ConversationLogsRequest](x: Self) {
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLogSettings(value: LogSettingsRequestList): Self = StObject.set(x, "logSettings", value.asInstanceOf[js.Any])
    
    inline def setLogSettingsVarargs(value: LogSettingsRequest*): Self = StObject.set(x, "logSettings", js.Array(value*))
  }
}
