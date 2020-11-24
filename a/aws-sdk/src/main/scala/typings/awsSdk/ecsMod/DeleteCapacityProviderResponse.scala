package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCapacityProviderResponse extends js.Object {
  
  var capacityProvider: js.UndefOr[CapacityProvider] = js.native
}
object DeleteCapacityProviderResponse {
  
  @scala.inline
  def apply(): DeleteCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCapacityProviderResponse]
  }
  
  @scala.inline
  implicit class DeleteCapacityProviderResponseOps[Self <: DeleteCapacityProviderResponse] (val x: Self) extends AnyVal {
    
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
    def setCapacityProvider(value: CapacityProvider): Self = this.set("capacityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityProvider: Self = this.set("capacityProvider", js.undefined)
  }
}
