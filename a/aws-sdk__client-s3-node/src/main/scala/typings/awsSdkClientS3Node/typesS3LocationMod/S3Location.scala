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

trait S3Location extends js.Object {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[Grant] | Iterable[Grant]] = js.undefined
  /**
    * <p>The name of the bucket where the restore results will be placed.</p>
    */
  var BucketName: String
  /**
    * <p>The canned ACL to apply to the restore results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.undefined
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  var Encryption: js.UndefOr[typings.awsSdkClientS3Node.typesEncryptionMod.Encryption] = js.undefined
  /**
    * <p>The prefix that is prepended to the restore results for this request.</p>
    */
  var Prefix: String
  /**
    * <p>The class of storage used to store the restore results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  var Tagging: js.UndefOr[typings.awsSdkClientS3Node.typesTaggingMod.Tagging] = js.undefined
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  var UserMetadata: js.UndefOr[js.Array[MetadataEntry] | Iterable[MetadataEntry]] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(
    BucketName: String,
    Prefix: String,
    AccessControlList: js.Array[Grant] | Iterable[Grant] = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: Encryption = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    Tagging: Tagging = null,
    UserMetadata: js.Array[MetadataEntry] | Iterable[MetadataEntry] = null
  ): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

