package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSensorStatisticsResponse extends StObject {
  
  /**
    * An opaque pagination token indicating where to continue the listing of sensor statistics. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutequipmentMod.NextToken] = js.undefined
  
  /**
    * Provides ingestion-based statistics regarding the specified sensor with respect to various validation types, such as whether data exists, the number and percentage of missing values, and the number and percentage of duplicate timestamps. 
    */
  var SensorStatisticsSummaries: js.UndefOr[typings.awsSdk.lookoutequipmentMod.SensorStatisticsSummaries] = js.undefined
}
object ListSensorStatisticsResponse {
  
  inline def apply(): ListSensorStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSensorStatisticsResponse]
  }
  
  extension [Self <: ListSensorStatisticsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSensorStatisticsSummaries(value: SensorStatisticsSummaries): Self = StObject.set(x, "SensorStatisticsSummaries", value.asInstanceOf[js.Any])
    
    inline def setSensorStatisticsSummariesUndefined: Self = StObject.set(x, "SensorStatisticsSummaries", js.undefined)
    
    inline def setSensorStatisticsSummariesVarargs(value: SensorStatisticsSummary*): Self = StObject.set(x, "SensorStatisticsSummaries", js.Array(value*))
  }
}
