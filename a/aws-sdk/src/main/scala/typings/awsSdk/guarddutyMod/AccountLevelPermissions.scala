package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLevelPermissions extends StObject {
  
  /**
    * Describes the S3 Block Public Access settings of the bucket's parent account.
    */
  var BlockPublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.BlockPublicAccess] = js.undefined
}
object AccountLevelPermissions {
  
  @scala.inline
  def apply(): AccountLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLevelPermissions]
  }
  
  @scala.inline
  implicit class AccountLevelPermissionsMutableBuilder[Self <: AccountLevelPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "BlockPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAccessUndefined: Self = StObject.set(x, "BlockPublicAccess", js.undefined)
  }
}
