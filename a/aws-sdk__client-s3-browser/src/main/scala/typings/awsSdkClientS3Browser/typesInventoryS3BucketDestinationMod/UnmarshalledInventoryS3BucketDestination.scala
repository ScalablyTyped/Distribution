package typings.awsSdkClientS3Browser.typesInventoryS3BucketDestinationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ORC
import typings.awsSdkClientS3Browser.typesInventoryEncryptionMod.UnmarshalledInventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInventoryS3BucketDestination extends InventoryS3BucketDestination {
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledInventoryS3BucketDestination: js.UndefOr[UnmarshalledInventoryEncryption] = js.undefined
}

object UnmarshalledInventoryS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: String,
    Format: CSV | ORC | String,
    AccountId: String = null,
    Encryption: UnmarshalledInventoryEncryption = null,
    Prefix: String = null
  ): UnmarshalledInventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryS3BucketDestination]
  }
}

