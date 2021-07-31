package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackagingGroupRequest extends StObject {
  
  var Authorization: js.UndefOr[typings.awsSdk.mediapackagevodMod.Authorization] = js.undefined
  
  /**
    * The ID of the PackagingGroup.
    */
  var Id: string
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.undefined
}
object CreatePackagingGroupRequest {
  
  @scala.inline
  def apply(Id: string): CreatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingGroupRequest]
  }
  
  @scala.inline
  implicit class CreatePackagingGroupRequestMutableBuilder[Self <: CreatePackagingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
