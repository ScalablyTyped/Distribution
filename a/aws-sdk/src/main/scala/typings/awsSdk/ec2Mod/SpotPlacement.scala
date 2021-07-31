package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotPlacement extends StObject {
  
  /**
    * The Availability Zone. [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example, "us-west-2a, us-west-2b".
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for Spot Instances.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.ec2Mod.Tenancy] = js.undefined
}
object SpotPlacement {
  
  @scala.inline
  def apply(): SpotPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotPlacement]
  }
  
  @scala.inline
  implicit class SpotPlacementMutableBuilder[Self <: SpotPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
