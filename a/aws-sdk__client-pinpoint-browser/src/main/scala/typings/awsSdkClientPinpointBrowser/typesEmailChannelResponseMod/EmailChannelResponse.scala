package typings.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailChannelResponse extends js.Object {
  
  /**
    * The unique ID of the application to which the email channel belongs.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  
  /**
    * The configuration set that you want to use when you send email using the Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[String] = js.native
  
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The email address used to send emails from.
    */
  var FromAddress: js.UndefOr[String] = js.native
  
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.native
  
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * The ARN of an identity verified with SES.
    */
  var Identity: js.UndefOr[String] = js.native
  
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[Boolean] = js.native
  
  /**
    * Who last updated this entry
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  
  /**
    * Messages per second that can be sent
    */
  var MessagesPerSecond: js.UndefOr[Double] = js.native
  
  /**
    * Platform type. Will be "EMAIL"
    */
  var Platform: js.UndefOr[String] = js.native
  
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
    */
  var RoleArn: js.UndefOr[String] = js.native
  
  /**
    * Version of channel
    */
  var Version: js.UndefOr[Double] = js.native
}
object EmailChannelResponse {
  
  @scala.inline
  def apply(): EmailChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailChannelResponse]
  }
  
  @scala.inline
  implicit class EmailChannelResponseOps[Self <: EmailChannelResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setConfigurationSet(value: String): Self = this.set("ConfigurationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSet: Self = this.set("ConfigurationSet", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setFromAddress(value: String): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    
    @scala.inline
    def setHasCredential(value: Boolean): Self = this.set("HasCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCredential: Self = this.set("HasCredential", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("Identity", js.undefined)
    
    @scala.inline
    def setIsArchived(value: Boolean): Self = this.set("IsArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArchived: Self = this.set("IsArchived", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setMessagesPerSecond(value: Double): Self = this.set("MessagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagesPerSecond: Self = this.set("MessagesPerSecond", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
