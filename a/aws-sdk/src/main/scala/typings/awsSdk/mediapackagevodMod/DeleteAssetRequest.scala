package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAssetRequest extends StObject {
  
  /**
    * The ID of the MediaPackage VOD Asset resource to delete.
    */
  var Id: string = js.native
}
object DeleteAssetRequest {
  
  @scala.inline
  def apply(Id: string): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetRequest]
  }
  
  @scala.inline
  implicit class DeleteAssetRequestMutableBuilder[Self <: DeleteAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
