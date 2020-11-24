package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPublicAccess extends js.Object {
  
  /**
    *  Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to the bucket. Possible values are: NOT_PUBLIC - The bucket isn't publicly accessible. PUBLIC - The bucket is publicly accessible. UNKNOWN - Amazon Macie can't determine whether the bucket is publicly accessible.
    */
  var effectivePermission: js.UndefOr[EffectivePermission] = js.native
  
  /**
    * The account-level and bucket-level permissions for the bucket.
    */
  var permissionConfiguration: js.UndefOr[BucketPermissionConfiguration] = js.native
}
object BucketPublicAccess {
  
  @scala.inline
  def apply(): BucketPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPublicAccess]
  }
  
  @scala.inline
  implicit class BucketPublicAccessOps[Self <: BucketPublicAccess] (val x: Self) extends AnyVal {
    
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
    def setEffectivePermission(value: EffectivePermission): Self = this.set("effectivePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePermission: Self = this.set("effectivePermission", js.undefined)
    
    @scala.inline
    def setPermissionConfiguration(value: BucketPermissionConfiguration): Self = this.set("permissionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionConfiguration: Self = this.set("permissionConfiguration", js.undefined)
  }
}
