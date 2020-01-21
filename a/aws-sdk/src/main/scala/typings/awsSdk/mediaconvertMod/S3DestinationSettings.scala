package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DestinationSettings extends js.Object {
  /**
    * Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.
    */
  var AccessControl: js.UndefOr[S3DestinationAccessControl] = js.native
  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  var Encryption: js.UndefOr[S3EncryptionSettings] = js.native
}

object S3DestinationSettings {
  @scala.inline
  def apply(AccessControl: S3DestinationAccessControl = null, Encryption: S3EncryptionSettings = null): S3DestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (AccessControl != null) __obj.updateDynamic("AccessControl")(AccessControl.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationSettings]
  }
}

