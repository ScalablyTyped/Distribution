package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainStatisticsReportResponse extends StObject {
  
  /**
    * An object that contains deliverability metrics for the domain that you specified. This object contains data for each day, starting on the StartDate and ending on the EndDate.
    */
  var DailyVolumes: typings.awsSdk.sesv2Mod.DailyVolumes
  
  /**
    * An object that contains deliverability metrics for the domain that you specified. The data in this object is a summary of all of the data that was collected from the StartDate to the EndDate.
    */
  var OverallVolume: typings.awsSdk.sesv2Mod.OverallVolume
}
object GetDomainStatisticsReportResponse {
  
  @scala.inline
  def apply(DailyVolumes: DailyVolumes, OverallVolume: OverallVolume): GetDomainStatisticsReportResponse = {
    val __obj = js.Dynamic.literal(DailyVolumes = DailyVolumes.asInstanceOf[js.Any], OverallVolume = OverallVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainStatisticsReportResponse]
  }
  
  @scala.inline
  implicit class GetDomainStatisticsReportResponseMutableBuilder[Self <: GetDomainStatisticsReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyVolumes(value: DailyVolumes): Self = StObject.set(x, "DailyVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyVolumesVarargs(value: DailyVolume*): Self = StObject.set(x, "DailyVolumes", js.Array(value :_*))
    
    @scala.inline
    def setOverallVolume(value: OverallVolume): Self = StObject.set(x, "OverallVolume", value.asInstanceOf[js.Any])
  }
}
