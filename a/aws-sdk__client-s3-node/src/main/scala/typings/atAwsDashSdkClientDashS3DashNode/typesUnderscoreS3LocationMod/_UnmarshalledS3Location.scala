package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreS3LocationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`authenticated-read`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`aws-exec-read`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`bucket-owner-full-control`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`bucket-owner-read`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`private`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`public-read-write`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`public-read`
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreEncryptionMod._UnmarshalledEncryption
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod._UnmarshalledGrant
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetadataEntryMod._UnmarshalledMetadataEntry
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTaggingMod._UnmarshalledTagging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledS3Location extends _S3Location {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  @JSName("AccessControlList")
  var AccessControlList__UnmarshalledS3Location: js.UndefOr[js.Array[_UnmarshalledGrant]] = js.undefined
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  @JSName("Encryption")
  var Encryption__UnmarshalledS3Location: js.UndefOr[_UnmarshalledEncryption] = js.undefined
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  @JSName("Tagging")
  var Tagging__UnmarshalledS3Location: js.UndefOr[_UnmarshalledTagging] = js.undefined
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata__UnmarshalledS3Location: js.UndefOr[js.Array[_UnmarshalledMetadataEntry]] = js.undefined
}

object _UnmarshalledS3Location {
  @scala.inline
  def apply(
    BucketName: String,
    Prefix: String,
    AccessControlList: js.Array[_UnmarshalledGrant] = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: _UnmarshalledEncryption = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    Tagging: _UnmarshalledTagging = null,
    UserMetadata: js.Array[_UnmarshalledMetadataEntry] = null
  ): _UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName, Prefix = Prefix)
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList)
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging)
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata)
    __obj.asInstanceOf[_UnmarshalledS3Location]
  }
}

