package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryS3BucketDestination extends js.Object {
  /**
    * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.    Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.  
    */
  var AccountId: js.UndefOr[typings.awsSdk.s3Mod.AccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
    */
  var Bucket: BucketName = js.native
  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.native
  /**
    * Specifies the output format of the inventory results.
    */
  var Format: InventoryFormat = js.native
  /**
    * The prefix that is prepended to all inventory results.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
}

object InventoryS3BucketDestination {
  @scala.inline
  def apply(Bucket: BucketName, Format: InventoryFormat): InventoryS3BucketDestination = {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: InventoryFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setEncryption(value: InventoryEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
  
}

