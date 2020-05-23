package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelResponse extends js.Object {
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when the channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * Specifies whether the channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Specifies whether the channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when the channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The current version of the channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object ChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: string = null,
    CreationDate: string = null,
    Enabled: js.UndefOr[boolean] = js.undefined,
    HasCredential: js.UndefOr[boolean] = js.undefined,
    Id: string = null,
    IsArchived: js.UndefOr[boolean] = js.undefined,
    LastModifiedBy: string = null,
    LastModifiedDate: string = null,
    Version: js.UndefOr[integer] = js.undefined
  ): ChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.get.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelResponse]
  }
}

