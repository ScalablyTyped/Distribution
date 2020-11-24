package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLevelPermissions extends js.Object {
  
  /**
    * Contains information on how Access Control Policies are applied to the bucket.
    */
  var AccessControlList: js.UndefOr[typings.awsSdk.guarddutyMod.AccessControlList] = js.native
  
  /**
    * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
    */
  var BlockPublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.BlockPublicAccess] = js.native
  
  /**
    * Contains information on the bucket policies for the S3 bucket.
    */
  var BucketPolicy: js.UndefOr[typings.awsSdk.guarddutyMod.BucketPolicy] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessControlList(value: AccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    
    @scala.inline
    def setBlockPublicAccess(value: BlockPublicAccess): Self = this.set("BlockPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicAccess: Self = this.set("BlockPublicAccess", js.undefined)
    
    @scala.inline
    def setBucketPolicy(value: BucketPolicy): Self = this.set("BucketPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPolicy: Self = this.set("BucketPolicy", js.undefined)
  }
}
