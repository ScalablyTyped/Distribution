package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCapacityProviderResponse extends StObject {
  
  var capacityProvider: js.UndefOr[CapacityProvider] = js.native
}
object DeleteCapacityProviderResponse {
  
  @scala.inline
  def apply(): DeleteCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCapacityProviderResponse]
  }
  
  @scala.inline
  implicit class DeleteCapacityProviderResponseMutableBuilder[Self <: DeleteCapacityProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProvider(value: CapacityProvider): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderUndefined: Self = StObject.set(x, "capacityProvider", js.undefined)
  }
}
