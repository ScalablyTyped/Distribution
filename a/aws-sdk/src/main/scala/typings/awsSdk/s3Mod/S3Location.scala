package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[Grants] = js.native
  /**
    * The name of the bucket where the restore results will be placed.
    */
  var BucketName: typings.awsSdk.s3Mod.BucketName = js.native
  /**
    * The canned ACL to apply to the restore results.
    */
  var CannedACL: js.UndefOr[ObjectCannedACL] = js.native
  var Encryption: js.UndefOr[typings.awsSdk.s3Mod.Encryption] = js.native
  /**
    * The prefix that is prepended to the restore results for this request.
    */
  var Prefix: LocationPrefix = js.native
  /**
    * The class of storage used to store the restore results.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * The tag-set that is applied to the restore results.
    */
  var Tagging: js.UndefOr[typings.awsSdk.s3Mod.Tagging] = js.native
  /**
    * A list of metadata to store with the restore results in S3.
    */
  var UserMetadata: js.UndefOr[typings.awsSdk.s3Mod.UserMetadata] = js.native
}

object S3Location {
  @scala.inline
  def apply(
    BucketName: BucketName,
    Prefix: LocationPrefix,
    AccessControlList: Grants = null,
    CannedACL: ObjectCannedACL = null,
    Encryption: Encryption = null,
    StorageClass: StorageClass = null,
    Tagging: Tagging = null,
    UserMetadata: UserMetadata = null
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

