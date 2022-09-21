package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DailyVolume extends StObject {
  
  /**
    * An object that contains inbox placement metrics for a specified day in the analysis period, broken out by the recipient's email provider.
    */
  var DomainIspPlacements: js.UndefOr[typings.awsSdk.pinpointemailMod.DomainIspPlacements] = js.undefined
  
  /**
    * The date that the DailyVolume metrics apply to, in Unix time.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that contains inbox placement metrics for a specific day in the analysis period.
    */
  var VolumeStatistics: js.UndefOr[typings.awsSdk.pinpointemailMod.VolumeStatistics] = js.undefined
}
object DailyVolume {
  
  inline def apply(): DailyVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyVolume]
  }
  
  extension [Self <: DailyVolume](x: Self) {
    
    inline def setDomainIspPlacements(value: DomainIspPlacements): Self = StObject.set(x, "DomainIspPlacements", value.asInstanceOf[js.Any])
    
    inline def setDomainIspPlacementsUndefined: Self = StObject.set(x, "DomainIspPlacements", js.undefined)
    
    inline def setDomainIspPlacementsVarargs(value: DomainIspPlacement*): Self = StObject.set(x, "DomainIspPlacements", js.Array(value*))
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setVolumeStatistics(value: VolumeStatistics): Self = StObject.set(x, "VolumeStatistics", value.asInstanceOf[js.Any])
    
    inline def setVolumeStatisticsUndefined: Self = StObject.set(x, "VolumeStatistics", js.undefined)
  }
}
