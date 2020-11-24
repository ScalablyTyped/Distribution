package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServicePower extends js.Object {
  
  /**
    * The number of vCPUs included in the power.
    */
  var cpuCount: js.UndefOr[float] = js.native
  
  /**
    * A Boolean value indicating whether the power is active and can be specified for container services.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * The friendly name of the power (e.g., nano).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the power (e.g., nano-1).
    */
  var powerId: js.UndefOr[String] = js.native
  
  /**
    * The monthly price of the power in USD.
    */
  var price: js.UndefOr[float] = js.native
  
  /**
    * The amount of RAM (in GB) of the power.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}
object ContainerServicePower {
  
  @scala.inline
  def apply(): ContainerServicePower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServicePower]
  }
  
  @scala.inline
  implicit class ContainerServicePowerOps[Self <: ContainerServicePower] (val x: Self) extends AnyVal {
    
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
    def setCpuCount(value: float): Self = this.set("cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuCount: Self = this.set("cpuCount", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPowerId(value: String): Self = this.set("powerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerId: Self = this.set("powerId", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = this.set("ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamSizeInGb: Self = this.set("ramSizeInGb", js.undefined)
  }
}
