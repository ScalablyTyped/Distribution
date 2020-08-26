package typings.awsSdkClientS3Node.typesS3LocationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`authenticated-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`aws-exec-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`bucket-owner-full-control`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`bucket-owner-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`private`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read-write`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read`
import typings.awsSdkClientS3Node.typesEncryptionMod.Encryption
import typings.awsSdkClientS3Node.typesGrantMod.Grant
import typings.awsSdkClientS3Node.typesMetadataEntryMod.MetadataEntry
import typings.awsSdkClientS3Node.typesTaggingMod.Tagging
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[Grant] | Iterable[Grant]] = js.native
  /**
    * <p>The name of the bucket where the restore results will be placed.</p>
    */
  var BucketName: String = js.native
  /**
    * <p>The canned ACL to apply to the restore results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.native
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  var Encryption: js.UndefOr[typings.awsSdkClientS3Node.typesEncryptionMod.Encryption] = js.native
  /**
    * <p>The prefix that is prepended to the restore results for this request.</p>
    */
  var Prefix: String = js.native
  /**
    * <p>The class of storage used to store the restore results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  var Tagging: js.UndefOr[typings.awsSdkClientS3Node.typesTaggingMod.Tagging] = js.native
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  var UserMetadata: js.UndefOr[js.Array[MetadataEntry] | Iterable[MetadataEntry]] = js.native
}

object S3Location {
  @scala.inline
  def apply(BucketName: String, Prefix: String): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
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
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessControlListVarargs(value: Grant*): Self = this.set("AccessControlList", js.Array(value :_*))
    @scala.inline
    def setAccessControlList(value: js.Array[Grant] | Iterable[Grant]): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    @scala.inline
    def setCannedACL(
      value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
    ): Self = this.set("CannedACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannedACL: Self = this.set("CannedACL", js.undefined)
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setTagging(value: Tagging): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    @scala.inline
    def setUserMetadataVarargs(value: MetadataEntry*): Self = this.set("UserMetadata", js.Array(value :_*))
    @scala.inline
    def setUserMetadata(value: js.Array[MetadataEntry] | Iterable[MetadataEntry]): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
  
}

