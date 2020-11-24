package typings.contentfulManagement.usageMod

import typings.contentfulManagement.commonTypesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageQuery extends QueryOptions {
  
  @JSName("dateRange.endAt")
  var dateRangeDotendAt: js.UndefOr[String] = js.native
  
  @JSName("dateRange.startAt")
  var dateRangeDotstartAt: js.UndefOr[String] = js.native
  
  var `metric[in]`: js.UndefOr[String] = js.native
}
object UsageQuery {
  
  @scala.inline
  def apply(): UsageQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageQuery]
  }
  
  @scala.inline
  implicit class UsageQueryOps[Self <: UsageQuery] (val x: Self) extends AnyVal {
    
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
    def setDateRangeDotendAt(value: String): Self = this.set("dateRange.endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRangeDotendAt: Self = this.set("dateRange.endAt", js.undefined)
    
    @scala.inline
    def setDateRangeDotstartAt(value: String): Self = this.set("dateRange.startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRangeDotstartAt: Self = this.set("dateRange.startAt", js.undefined)
    
    @scala.inline
    def `setMetric[in]`(value: String): Self = this.set("metric[in]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMetric[in]`: Self = this.set("metric[in]", js.undefined)
  }
}
