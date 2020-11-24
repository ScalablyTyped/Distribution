package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCapacityProviderRequest extends js.Object {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
    */
  var capacityProvider: String = js.native
}
object DeleteCapacityProviderRequest {
  
  @scala.inline
  def apply(capacityProvider: String): DeleteCapacityProviderRequest = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCapacityProviderRequest]
  }
  
  @scala.inline
  implicit class DeleteCapacityProviderRequestOps[Self <: DeleteCapacityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacityProvider(value: String): Self = this.set("capacityProvider", value.asInstanceOf[js.Any])
  }
}
