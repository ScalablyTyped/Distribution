package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackagingGroupRequest extends StObject {
  
  var Authorization: js.UndefOr[typings.awsSdk.mediapackagevodMod.Authorization] = js.undefined
  
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string
}
object UpdatePackagingGroupRequest {
  
  @scala.inline
  def apply(Id: string): UpdatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackagingGroupRequest]
  }
  
  @scala.inline
  implicit class UpdatePackagingGroupRequestMutableBuilder[Self <: UpdatePackagingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
