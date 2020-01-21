package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

