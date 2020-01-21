package typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.CSV
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ORC
import typings.awsSdkClientS3Node.typesInventoryEncryptionMod.InventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryS3BucketDestination extends js.Object {
  /**
    * <p>The ID of the account that owns the destination bucket.</p>
    */
  var AccountId: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon resource name (ARN) of the bucket where inventory results will be published.</p>
    */
  var Bucket: String
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.undefined
  /**
    * <p>Specifies the output format of the inventory results.</p>
    */
  var Format: CSV | ORC | String
  /**
    * <p>The prefix that is prepended to all inventory results.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object InventoryS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: String,
    Format: CSV | ORC | String,
    AccountId: String = null,
    Encryption: InventoryEncryption = null,
    Prefix: String = null
  ): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
}

