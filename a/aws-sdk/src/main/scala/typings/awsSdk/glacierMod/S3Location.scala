package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[AccessControlPolicyList] = js.native
  /**
    * The name of the Amazon S3 bucket where the job results are stored.
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * The canned access control list (ACL) to apply to the job results.
    */
  var CannedACL: js.UndefOr[typings.awsSdk.glacierMod.CannedACL] = js.native
  /**
    * Contains information about the encryption used to store the job results in Amazon S3.
    */
  var Encryption: js.UndefOr[typings.awsSdk.glacierMod.Encryption] = js.native
  /**
    * The prefix that is prepended to the results for this request.
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * The storage class used to store the job results.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.glacierMod.StorageClass] = js.native
  /**
    * The tag-set that is applied to the job results.
    */
  var Tagging: js.UndefOr[hashmap] = js.native
  /**
    * A map of metadata to store with the job results in Amazon S3.
    */
  var UserMetadata: js.UndefOr[hashmap] = js.native
}

object S3Location {
  @scala.inline
  def apply(
    AccessControlList: AccessControlPolicyList = null,
    BucketName: String = null,
    CannedACL: CannedACL = null,
    Encryption: Encryption = null,
    Prefix: String = null,
    StorageClass: StorageClass = null,
    Tagging: hashmap = null,
    UserMetadata: hashmap = null
  ): S3Location = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

