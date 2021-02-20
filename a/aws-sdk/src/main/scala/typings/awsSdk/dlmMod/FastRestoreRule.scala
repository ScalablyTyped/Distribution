package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastRestoreRule extends StObject {
  
  /**
    * The Availability Zones in which to enable fast snapshot restore.
    */
  var AvailabilityZones: AvailabilityZoneList = js.native
  
  /**
    * The number of snapshots to be enabled with fast snapshot restore.
    */
  var Count: js.UndefOr[typings.awsSdk.dlmMod.Count] = js.native
  
  /**
    * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.native
  
  /**
    * The unit of time for enabling fast snapshot restore.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}
object FastRestoreRule {
  
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZoneList): FastRestoreRule = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRestoreRule]
  }
  
  @scala.inline
  implicit class FastRestoreRuleMutableBuilder[Self <: FastRestoreRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Count): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setIntervalUnit(value: RetentionIntervalUnitValues): Self = StObject.set(x, "IntervalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUnitUndefined: Self = StObject.set(x, "IntervalUnit", js.undefined)
  }
}
