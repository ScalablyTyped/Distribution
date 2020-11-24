package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsageStatisticsResponse extends js.Object {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The usage statistics object. If a UsageStatisticType was provided, the objects representing other types will be null.
    */
  var UsageStatistics: js.UndefOr[typings.awsSdk.guarddutyMod.UsageStatistics] = js.native
}
object GetUsageStatisticsResponse {
  
  @scala.inline
  def apply(): GetUsageStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetUsageStatisticsResponseOps[Self <: GetUsageStatisticsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setUsageStatistics(value: UsageStatistics): Self = this.set("UsageStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageStatistics: Self = this.set("UsageStatistics", js.undefined)
  }
}
