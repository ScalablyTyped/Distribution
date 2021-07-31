package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionConfiguration extends StObject {
  
  /**
    * Contains information about the account level permissions on the S3 bucket.
    */
  var AccountLevelPermissions: js.UndefOr[typings.awsSdk.guarddutyMod.AccountLevelPermissions] = js.undefined
  
  /**
    * Contains information about the bucket level permissions for the S3 bucket.
    */
  var BucketLevelPermissions: js.UndefOr[typings.awsSdk.guarddutyMod.BucketLevelPermissions] = js.undefined
}
object PermissionConfiguration {
  
  @scala.inline
  def apply(): PermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionConfiguration]
  }
  
  @scala.inline
  implicit class PermissionConfigurationMutableBuilder[Self <: PermissionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountLevelPermissions(value: AccountLevelPermissions): Self = StObject.set(x, "AccountLevelPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLevelPermissionsUndefined: Self = StObject.set(x, "AccountLevelPermissions", js.undefined)
    
    @scala.inline
    def setBucketLevelPermissions(value: BucketLevelPermissions): Self = StObject.set(x, "BucketLevelPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketLevelPermissionsUndefined: Self = StObject.set(x, "BucketLevelPermissions", js.undefined)
  }
}
