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
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
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
    def setAccessControlListVarargs(value: Grant*): Self = this.set("AccessControlList", js.Array(value :_*))
    @scala.inline
    def setAccessControlList(value: AccessControlPolicyList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    @scala.inline
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    @scala.inline
    def setCannedACL(value: CannedACL): Self = this.set("CannedACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannedACL: Self = this.set("CannedACL", js.undefined)
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setTagging(value: hashmap): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    @scala.inline
    def setUserMetadata(value: hashmap): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
  
}

