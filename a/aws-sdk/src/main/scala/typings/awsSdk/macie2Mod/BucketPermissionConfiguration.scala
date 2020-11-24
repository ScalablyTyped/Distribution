package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPermissionConfiguration extends js.Object {
  
  /**
    * The account-level permissions settings that apply to the bucket.
    */
  var accountLevelPermissions: js.UndefOr[AccountLevelPermissions] = js.native
  
  /**
    * The bucket-level permissions settings for the bucket.
    */
  var bucketLevelPermissions: js.UndefOr[BucketLevelPermissions] = js.native
}
object BucketPermissionConfiguration {
  
  @scala.inline
  def apply(): BucketPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPermissionConfiguration]
  }
  
  @scala.inline
  implicit class BucketPermissionConfigurationOps[Self <: BucketPermissionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAccountLevelPermissions(value: AccountLevelPermissions): Self = this.set("accountLevelPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountLevelPermissions: Self = this.set("accountLevelPermissions", js.undefined)
    
    @scala.inline
    def setBucketLevelPermissions(value: BucketLevelPermissions): Self = this.set("bucketLevelPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketLevelPermissions: Self = this.set("bucketLevelPermissions", js.undefined)
  }
}
