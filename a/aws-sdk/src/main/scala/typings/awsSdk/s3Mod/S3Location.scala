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
  def apply(BucketName: BucketName, Prefix: LocationPrefix): S3Location = {
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
    def setBucketName(value: BucketName): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: LocationPrefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessControlListVarargs(value: Grant*): Self = this.set("AccessControlList", js.Array(value :_*))
    @scala.inline
    def setAccessControlList(value: Grants): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    @scala.inline
    def setCannedACL(value: ObjectCannedACL): Self = this.set("CannedACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannedACL: Self = this.set("CannedACL", js.undefined)
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setTagging(value: Tagging): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    @scala.inline
    def setUserMetadataVarargs(value: MetadataEntry*): Self = this.set("UserMetadata", js.Array(value :_*))
    @scala.inline
    def setUserMetadata(value: UserMetadata): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
  
}

