package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailChannelRequest extends StObject {
  
  /**
    * The Amazon SES configuration set that you want to apply to messages that you send through the channel.
    */
  var ConfigurationSet: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether to enable the email channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    *  The verified email address that you want to send email from when you send email through the channel.
    */
  var FromAddress: string = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you want to use when you send email through the channel.
    */
  var Identity: string = js.native
  
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
}
object EmailChannelRequest {
  
  @scala.inline
  def apply(FromAddress: string, Identity: string): EmailChannelRequest = {
    val __obj = js.Dynamic.literal(FromAddress = FromAddress.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelRequest]
  }
  
  @scala.inline
  implicit class EmailChannelRequestMutableBuilder[Self <: EmailChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSet(value: string): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setFromAddress(value: string): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: string): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
