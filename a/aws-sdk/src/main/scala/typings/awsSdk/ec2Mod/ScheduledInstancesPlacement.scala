package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesPlacement extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.undefined
}
object ScheduledInstancesPlacement {
  
  @scala.inline
  def apply(): ScheduledInstancesPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesPlacement]
  }
  
  @scala.inline
  implicit class ScheduledInstancesPlacementMutableBuilder[Self <: ScheduledInstancesPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
