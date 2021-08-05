package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainStatisticsReportResponse extends StObject {
  
  /**
    * An object that contains deliverability metrics for the domain that you specified. This object contains data for each day, starting on the StartDate and ending on the EndDate.
    */
  var DailyVolumes: typings.awsSdk.pinpointemailMod.DailyVolumes
  
  /**
    * An object that contains deliverability metrics for the domain that you specified. The data in this object is a summary of all of the data that was collected from the StartDate to the EndDate.
    */
  var OverallVolume: typings.awsSdk.pinpointemailMod.OverallVolume
}
object GetDomainStatisticsReportResponse {
  
  inline def apply(DailyVolumes: DailyVolumes, OverallVolume: OverallVolume): GetDomainStatisticsReportResponse = {
    val __obj = js.Dynamic.literal(DailyVolumes = DailyVolumes.asInstanceOf[js.Any], OverallVolume = OverallVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainStatisticsReportResponse]
  }
  
  extension [Self <: GetDomainStatisticsReportResponse](x: Self) {
    
    inline def setDailyVolumes(value: DailyVolumes): Self = StObject.set(x, "DailyVolumes", value.asInstanceOf[js.Any])
    
    inline def setDailyVolumesVarargs(value: DailyVolume*): Self = StObject.set(x, "DailyVolumes", js.Array(value :_*))
    
    inline def setOverallVolume(value: OverallVolume): Self = StObject.set(x, "OverallVolume", value.asInstanceOf[js.Any])
  }
}
