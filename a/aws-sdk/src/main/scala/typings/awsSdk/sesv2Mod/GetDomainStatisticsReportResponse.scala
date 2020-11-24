package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainStatisticsReportResponse extends js.Object {
  
  /**
    * An object that contains deliverability metrics for the domain that you specified. This object contains data for each day, starting on the StartDate and ending on the EndDate.
    */
  var DailyVolumes: typings.awsSdk.sesv2Mod.DailyVolumes = js.native
  
  /**
    * An object that contains deliverability metrics for the domain that you specified. The data in this object is a summary of all of the data that was collected from the StartDate to the EndDate.
    */
  var OverallVolume: typings.awsSdk.sesv2Mod.OverallVolume = js.native
}
object GetDomainStatisticsReportResponse {
  
  @scala.inline
  def apply(DailyVolumes: DailyVolumes, OverallVolume: OverallVolume): GetDomainStatisticsReportResponse = {
    val __obj = js.Dynamic.literal(DailyVolumes = DailyVolumes.asInstanceOf[js.Any], OverallVolume = OverallVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainStatisticsReportResponse]
  }
  
  @scala.inline
  implicit class GetDomainStatisticsReportResponseOps[Self <: GetDomainStatisticsReportResponse] (val x: Self) extends AnyVal {
    
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
    def setDailyVolumesVarargs(value: DailyVolume*): Self = this.set("DailyVolumes", js.Array(value :_*))
    
    @scala.inline
    def setDailyVolumes(value: DailyVolumes): Self = this.set("DailyVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallVolume(value: OverallVolume): Self = this.set("OverallVolume", value.asInstanceOf[js.Any])
  }
}
