package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetProvisioningSpecifications extends js.Object {
  
  /**
    *  The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation strategy is available in Amazon EMR version 5.12.1 and later. 
    */
  var OnDemandSpecification: js.UndefOr[OnDemandProvisioningSpecification] = js.native
  
  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration, provisioning timeout behavior, and allocation strategy.
    */
  var SpotSpecification: js.UndefOr[SpotProvisioningSpecification] = js.native
}
object InstanceFleetProvisioningSpecifications {
  
  @scala.inline
  def apply(): InstanceFleetProvisioningSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
  }
  
  @scala.inline
  implicit class InstanceFleetProvisioningSpecificationsOps[Self <: InstanceFleetProvisioningSpecifications] (val x: Self) extends AnyVal {
    
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
    def setOnDemandSpecification(value: OnDemandProvisioningSpecification): Self = this.set("OnDemandSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandSpecification: Self = this.set("OnDemandSpecification", js.undefined)
    
    @scala.inline
    def setSpotSpecification(value: SpotProvisioningSpecification): Self = this.set("SpotSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotSpecification: Self = this.set("SpotSpecification", js.undefined)
  }
}
