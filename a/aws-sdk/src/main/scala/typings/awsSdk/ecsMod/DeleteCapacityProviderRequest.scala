package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCapacityProviderRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
    */
  var capacityProvider: String
}
object DeleteCapacityProviderRequest {
  
  @scala.inline
  def apply(capacityProvider: String): DeleteCapacityProviderRequest = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCapacityProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteCapacityProviderRequestMutableBuilder[Self <: DeleteCapacityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProvider(value: String): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
  }
}
