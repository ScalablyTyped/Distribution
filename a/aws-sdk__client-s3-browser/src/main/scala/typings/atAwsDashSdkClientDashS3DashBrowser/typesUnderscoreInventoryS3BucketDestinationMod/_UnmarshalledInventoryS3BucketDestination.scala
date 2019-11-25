package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryS3BucketDestinationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.CSV
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ORC
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryEncryptionMod._UnmarshalledInventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledInventoryS3BucketDestination extends _InventoryS3BucketDestination {
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  @JSName("Encryption")
  var Encryption__UnmarshalledInventoryS3BucketDestination: js.UndefOr[_UnmarshalledInventoryEncryption] = js.undefined
}

object _UnmarshalledInventoryS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: String,
    Format: CSV | ORC | String,
    AccountId: String = null,
    Encryption: _UnmarshalledInventoryEncryption = null,
    Prefix: String = null
  ): _UnmarshalledInventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledInventoryS3BucketDestination]
  }
}

