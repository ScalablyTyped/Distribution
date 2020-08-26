package typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.CSV
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ORC
import typings.awsSdkClientS3Node.typesInventoryEncryptionMod.InventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryS3BucketDestination extends js.Object {
  /**
    * <p>The ID of the account that owns the destination bucket.</p>
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * <p>The Amazon resource name (ARN) of the bucket where inventory results will be published.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.native
  /**
    * <p>Specifies the output format of the inventory results.</p>
    */
  var Format: CSV | ORC | String = js.native
  /**
    * <p>The prefix that is prepended to all inventory results.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
}

object InventoryS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | ORC | String): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
  @scala.inline
  implicit class InventoryS3BucketDestinationOps[Self <: InventoryS3BucketDestination] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: CSV | ORC | String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setEncryption(value: InventoryEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
  
}

