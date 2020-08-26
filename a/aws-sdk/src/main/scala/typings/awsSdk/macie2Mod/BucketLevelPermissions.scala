package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLevelPermissions extends js.Object {
  /**
    * The permissions settings of the access control list (ACL) for the bucket. This value is null if an ACL hasn't been defined for the bucket.
    */
  var accessControlList: js.UndefOr[AccessControlList] = js.native
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.native
  /**
    * The permissions settings of the bucket policy for the bucket. This value is null if a bucket policy hasn't been defined for the bucket.
    */
  var bucketPolicy: js.UndefOr[BucketPolicy] = js.native
}

object BucketLevelPermissions {
  @scala.inline
  def apply(): BucketLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLevelPermissions]
  }
  @scala.inline
  implicit class BucketLevelPermissionsOps[Self <: BucketLevelPermissions] (val x: Self) extends AnyVal {
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
    def setAccessControlList(value: AccessControlList): Self = this.set("accessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlList: Self = this.set("accessControlList", js.undefined)
    @scala.inline
    def setBlockPublicAccess(value: BlockPublicAccess): Self = this.set("blockPublicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockPublicAccess: Self = this.set("blockPublicAccess", js.undefined)
    @scala.inline
    def setBucketPolicy(value: BucketPolicy): Self = this.set("bucketPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketPolicy: Self = this.set("bucketPolicy", js.undefined)
  }
  
}

