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
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreEncryptionMod._Encryption
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod._Grant
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetadataEntryMod._MetadataEntry
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTaggingMod._Tagging
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _S3Location extends js.Object {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[_Grant] | Iterable[_Grant]] = js.undefined
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
  var Encryption: js.UndefOr[_Encryption] = js.undefined
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
  var Tagging: js.UndefOr[_Tagging] = js.undefined
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  var UserMetadata: js.UndefOr[js.Array[_MetadataEntry] | Iterable[_MetadataEntry]] = js.undefined
}

object _S3Location {
  @scala.inline
  def apply(
    BucketName: String,
    Prefix: String,
    AccessControlList: js.Array[_Grant] | Iterable[_Grant] = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: _Encryption = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    Tagging: _Tagging = null,
    UserMetadata: js.Array[_MetadataEntry] | Iterable[_MetadataEntry] = null
  ): _S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[_S3Location]
  }
}

