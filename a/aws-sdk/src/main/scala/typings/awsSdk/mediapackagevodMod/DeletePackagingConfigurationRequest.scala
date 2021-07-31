package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackagingConfigurationRequest extends StObject {
  
  /**
    * The ID of the MediaPackage VOD PackagingConfiguration resource to delete.
    */
  var Id: string
}
object DeletePackagingConfigurationRequest {
  
  @scala.inline
  def apply(Id: string): DeletePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackagingConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeletePackagingConfigurationRequestMutableBuilder[Self <: DeletePackagingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
