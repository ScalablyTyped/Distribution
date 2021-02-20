package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grant extends StObject {
  
  /**
    * The person being granted permissions.
    */
  var Grantee: js.UndefOr[typings.awsSdk.s3Mod.Grantee] = js.native
  
  /**
    * Specifies the permission given to the grantee.
    */
  var Permission: js.UndefOr[typings.awsSdk.s3Mod.Permission] = js.native
}
object Grant {
  
  @scala.inline
  def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  
  @scala.inline
  implicit class GrantMutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    @scala.inline
    def setPermission(value: Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
