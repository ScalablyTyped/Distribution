package typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.CSV
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ORC
import typings.awsSdkClientS3Node.typesInventoryEncryptionMod.UnmarshalledInventoryEncryption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInventoryS3BucketDestination extends InventoryS3BucketDestination {
  /**
    * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledInventoryS3BucketDestination: js.UndefOr[UnmarshalledInventoryEncryption] = js.native
}

object UnmarshalledInventoryS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | ORC | String): UnmarshalledInventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryS3BucketDestination]
  }
  @scala.inline
  implicit class UnmarshalledInventoryS3BucketDestinationOps[Self <: UnmarshalledInventoryS3BucketDestination] (val x: Self) extends AnyVal {
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
    def setEncryption(value: UnmarshalledInventoryEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
  }
  
}

