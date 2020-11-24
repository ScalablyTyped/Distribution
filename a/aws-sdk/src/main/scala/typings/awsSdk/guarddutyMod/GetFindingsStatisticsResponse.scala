package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsStatisticsResponse extends js.Object {
  
  /**
    * The finding statistics object.
    */
  var FindingStatistics: typings.awsSdk.guarddutyMod.FindingStatistics = js.native
}
object GetFindingsStatisticsResponse {
  
  @scala.inline
  def apply(FindingStatistics: FindingStatistics): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal(FindingStatistics = FindingStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetFindingsStatisticsResponseOps[Self <: GetFindingsStatisticsResponse] (val x: Self) extends AnyVal {
    
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
    def setFindingStatistics(value: FindingStatistics): Self = this.set("FindingStatistics", value.asInstanceOf[js.Any])
  }
}
