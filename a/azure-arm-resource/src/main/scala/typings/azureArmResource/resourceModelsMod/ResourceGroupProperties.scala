package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupProperties extends js.Object {
  
  /**
    * The provisioning state.
    */
  val provisioningState: js.UndefOr[String] = js.native
}
object ResourceGroupProperties {
  
  @scala.inline
  def apply(): ResourceGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupProperties]
  }
  
  @scala.inline
  implicit class ResourceGroupPropertiesOps[Self <: ResourceGroupProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvisioningState(value: String): Self = this.set("provisioningState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningState: Self = this.set("provisioningState", js.undefined)
  }
}
