package typings.awsSdkClientPinpointBrowser.typesEmailChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailChannelRequest extends js.Object {
  
  /**
    * The configuration set that you want to use when you send email using the Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[String] = js.native
  
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The email address used to send emails from.
    */
  var FromAddress: js.UndefOr[String] = js.native
  
  /**
    * The ARN of an identity verified with SES.
    */
  var Identity: js.UndefOr[String] = js.native
  
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
    */
  var RoleArn: js.UndefOr[String] = js.native
}
object EmailChannelRequest {
  
  @scala.inline
  def apply(): EmailChannelRequest = {
    val __obj = js.Dynamic.literal()
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
    def setConfigurationSet(value: String): Self = this.set("ConfigurationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSet: Self = this.set("ConfigurationSet", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setFromAddress(value: String): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("Identity", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}
