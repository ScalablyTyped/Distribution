package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossRegionCopyRetainRule extends js.Object {
  
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.native
  
  /**
    * The unit of time for time-based retention.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}
object CrossRegionCopyRetainRule {
  
  @scala.inline
  def apply(): CrossRegionCopyRetainRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossRegionCopyRetainRule]
  }
  
  @scala.inline
  implicit class CrossRegionCopyRetainRuleOps[Self <: CrossRegionCopyRetainRule] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Interval): Self = this.set("Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    
    @scala.inline
    def setIntervalUnit(value: RetentionIntervalUnitValues): Self = this.set("IntervalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalUnit: Self = this.set("IntervalUnit", js.undefined)
  }
}
