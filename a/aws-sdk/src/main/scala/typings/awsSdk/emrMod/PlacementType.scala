package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementType extends StObject {
  
  /**
    * The Amazon EC2 Availability Zone for the cluster. AvailabilityZone is used for uniform instance groups, while AvailabilityZones (plural) is used for instance fleets.
    */
  var AvailabilityZone: js.UndefOr[XmlString] = js.native
  
  /**
    * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal Availability Zone. AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for uniform instance groups.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  var AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.native
}
object PlacementType {
  
  @scala.inline
  def apply(): PlacementType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementType]
  }
  
  @scala.inline
  implicit class PlacementTypeMutableBuilder[Self <: PlacementType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: XmlString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailabilityZones(value: XmlStringMaxLen256List): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
  }
}
