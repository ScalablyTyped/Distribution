package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackagingGroupRequest extends StObject {
  
  /**
    * The ID of the MediaPackage VOD PackagingGroup resource to delete.
    */
  var Id: string
}
object DeletePackagingGroupRequest {
  
  @scala.inline
  def apply(Id: string): DeletePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackagingGroupRequest]
  }
  
  @scala.inline
  implicit class DeletePackagingGroupRequestMutableBuilder[Self <: DeletePackagingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
