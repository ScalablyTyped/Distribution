package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPermissionConfiguration extends StObject {
  
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
  implicit class BucketPermissionConfigurationMutableBuilder[Self <: BucketPermissionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountLevelPermissions(value: AccountLevelPermissions): Self = StObject.set(x, "accountLevelPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLevelPermissionsUndefined: Self = StObject.set(x, "accountLevelPermissions", js.undefined)
    
    @scala.inline
    def setBucketLevelPermissions(value: BucketLevelPermissions): Self = StObject.set(x, "bucketLevelPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketLevelPermissionsUndefined: Self = StObject.set(x, "bucketLevelPermissions", js.undefined)
  }
}
