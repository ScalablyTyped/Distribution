package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingStatistics extends js.Object {
  
  /**
    * Represents a map of severity to count statistics for a set of findings.
    */
  var CountBySeverity: js.UndefOr[typings.awsSdk.guarddutyMod.CountBySeverity] = js.native
}
object FindingStatistics {
  
  @scala.inline
  def apply(): FindingStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingStatistics]
  }
  
  @scala.inline
  implicit class FindingStatisticsOps[Self <: FindingStatistics] (val x: Self) extends AnyVal {
    
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
    def setCountBySeverity(value: CountBySeverity): Self = this.set("CountBySeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountBySeverity: Self = this.set("CountBySeverity", js.undefined)
  }
}
