package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailChannelRequest extends js.Object {
  
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
  implicit class EmailChannelRequestOps[Self <: EmailChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setFromAddress(value: string): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: string): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSet(value: string): Self = this.set("ConfigurationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSet: Self = this.set("ConfigurationSet", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}
