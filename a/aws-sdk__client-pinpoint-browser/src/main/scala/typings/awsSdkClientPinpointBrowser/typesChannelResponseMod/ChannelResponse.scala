package typings.awsSdkClientPinpointBrowser.typesChannelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelResponse extends js.Object {
  /**
    * Application id
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * When was this segment created
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.native
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[Boolean] = js.native
  /**
    * Who made the last change
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * Version of channel
    */
  var Version: js.UndefOr[Double] = js.native
}

object ChannelResponse {
  @scala.inline
  def apply(): ChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelResponse]
  }
  @scala.inline
  implicit class ChannelResponseOps[Self <: ChannelResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setHasCredential(value: Boolean): Self = this.set("HasCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCredential: Self = this.set("HasCredential", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
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
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

