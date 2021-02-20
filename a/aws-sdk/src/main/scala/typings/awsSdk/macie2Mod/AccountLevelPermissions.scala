package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountLevelPermissions extends StObject {
  
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.native
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
    def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "blockPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAccessUndefined: Self = StObject.set(x, "blockPublicAccess", js.undefined)
  }
}
