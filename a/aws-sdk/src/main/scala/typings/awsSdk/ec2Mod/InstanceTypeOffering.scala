package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTypeOffering extends js.Object {
  
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The identifier for the location. This depends on the location type. For example, if the location type is region, the location is the Region code (for example, us-east-2.)
    */
  var Location: js.UndefOr[typings.awsSdk.ec2Mod.Location] = js.native
  
  /**
    * The location type.
    */
  var LocationType: js.UndefOr[typings.awsSdk.ec2Mod.LocationType] = js.native
}
object InstanceTypeOffering {
  
  @scala.inline
  def apply(): InstanceTypeOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeOffering]
  }
  
  @scala.inline
  implicit class InstanceTypeOfferingOps[Self <: InstanceTypeOffering] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setLocationType(value: LocationType): Self = this.set("LocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("LocationType", js.undefined)
  }
}
