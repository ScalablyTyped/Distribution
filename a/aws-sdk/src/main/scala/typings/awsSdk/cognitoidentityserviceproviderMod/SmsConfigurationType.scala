package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmsConfigurationType extends js.Object {
  
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
  implicit class SmsConfigurationTypeOps[Self <: SmsConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setSnsCallerArn(value: ArnType): Self = this.set("SnsCallerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: StringType): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
  }
}
