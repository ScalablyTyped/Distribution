package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryS3BucketDestinationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.CSV
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ORC
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryEncryptionMod._InventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventoryS3BucketDestination extends js.Object {
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
  var Encryption: js.UndefOr[_InventoryEncryption] = js.undefined
  /**
    * <p>Specifies the output format of the inventory results.</p>
    */
  var Format: CSV | ORC | String
  /**
    * <p>The prefix that is prepended to all inventory results.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object _InventoryS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: String,
    Format: CSV | ORC | String,
    AccountId: String = null,
    Encryption: _InventoryEncryption = null,
    Prefix: String = null
  ): _InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InventoryS3BucketDestination]
  }
}

