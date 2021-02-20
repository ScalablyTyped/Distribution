package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Grant extends StObject {
  
  /**
    * 
    */
  var Grantee: js.UndefOr[S3Grantee] = js.native
  
  /**
    * 
    */
  var Permission: js.UndefOr[S3Permission] = js.native
}
object S3Grant {
  
  @scala.inline
  def apply(): S3Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grant]
  }
  
  @scala.inline
  implicit class S3GrantMutableBuilder[Self <: S3Grant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrantee(value: S3Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    @scala.inline
    def setPermission(value: S3Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
