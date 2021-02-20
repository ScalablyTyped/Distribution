package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmsConfigurationType extends StObject {
  
  /**
    * The external ID is a value that we recommend you use to add security to your IAM role which is used to call Amazon SNS to send SMS messages for your user pool. If you provide an ExternalId, the Cognito User Pool will include it when attempting to assume your IAM role, so that you can set your roles trust policy to require the ExternalID. If you use the Cognito Management Console to create a role for SMS MFA, Cognito will create a role with the required permissions and a trust policy that demonstrates use of the ExternalId.
    */
  var ExternalId: js.UndefOr[StringType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller. This is the ARN of the IAM role in your AWS account which Cognito will use to send SMS messages.
    */
  var SnsCallerArn: ArnType = js.native
}
object SmsConfigurationType {
  
  @scala.inline
  def apply(SnsCallerArn: ArnType): SmsConfigurationType = {
    val __obj = js.Dynamic.literal(SnsCallerArn = SnsCallerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsConfigurationType]
  }
  
  @scala.inline
  implicit class SmsConfigurationTypeMutableBuilder[Self <: SmsConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalId(value: StringType): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    @scala.inline
    def setSnsCallerArn(value: ArnType): Self = StObject.set(x, "SnsCallerArn", value.asInstanceOf[js.Any])
  }
}
