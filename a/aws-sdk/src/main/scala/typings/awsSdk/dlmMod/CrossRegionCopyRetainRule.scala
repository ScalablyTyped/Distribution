package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossRegionCopyRetainRule extends StObject {
  
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.undefined
  
  /**
    * The unit of time for time-based retention.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
}
object CrossRegionCopyRetainRule {
  
  @scala.inline
  def apply(): CrossRegionCopyRetainRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossRegionCopyRetainRule]
  }
  
  @scala.inline
  implicit class CrossRegionCopyRetainRuleMutableBuilder[Self <: CrossRegionCopyRetainRule] (val x: Self) extends AnyVal {
    
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
