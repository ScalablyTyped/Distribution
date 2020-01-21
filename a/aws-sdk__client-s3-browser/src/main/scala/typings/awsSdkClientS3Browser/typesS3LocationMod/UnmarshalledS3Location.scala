package typings.awsSdkClientS3Browser.typesS3LocationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`aws-exec-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-full-control`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typings.awsSdkClientS3Browser.typesEncryptionMod.UnmarshalledEncryption
import typings.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typings.awsSdkClientS3Browser.typesMetadataEntryMod.UnmarshalledMetadataEntry
import typings.awsSdkClientS3Browser.typesTaggingMod.UnmarshalledTagging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledS3Location extends S3Location {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  @JSName("AccessControlList")
  var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.undefined
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  @JSName("Tagging")
  var Tagging_UnmarshalledS3Location: js.UndefOr[UnmarshalledTagging] = js.undefined
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledMetadataEntry]] = js.undefined
}

object UnmarshalledS3Location {
  @scala.inline
  def apply(
    BucketName: String,
    Prefix: String,
    AccessControlList: js.Array[UnmarshalledGrant] = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: UnmarshalledEncryption = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    Tagging: UnmarshalledTagging = null,
    UserMetadata: js.Array[UnmarshalledMetadataEntry] = null
  ): UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledS3Location]
  }
}

