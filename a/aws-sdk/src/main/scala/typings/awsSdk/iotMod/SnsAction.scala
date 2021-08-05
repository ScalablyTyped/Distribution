package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsAction extends StObject {
  
  /**
    * (Optional) The message format of the message to publish. Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant platform-specific bits of the payload should be extracted. To read more about SNS message formats, see https://docs.aws.amazon.com/sns/latest/dg/json-formats.html refer to their official documentation.
    */
  var messageFormat: js.UndefOr[MessageFormat] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
  
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: AwsArn
}
object SnsAction {
  
  inline def apply(roleArn: AwsArn, targetArn: AwsArn): SnsAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsAction]
  }
  
  extension [Self <: SnsAction](x: Self) {
    
    inline def setMessageFormat(value: MessageFormat): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArn(value: AwsArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
