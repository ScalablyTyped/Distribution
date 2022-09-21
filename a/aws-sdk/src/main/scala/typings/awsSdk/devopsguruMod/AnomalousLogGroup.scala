package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalousLogGroup extends StObject {
  
  /**
    *  The time the anomalous log events stopped. 
    */
  var ImpactEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The time the anomalous log events began. The impact start time indicates the time of the first log anomaly event that occurs. 
    */
  var ImpactStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The log anomalies in the log group. Each log anomaly displayed represents a cluster of similar anomalous log events. 
    */
  var LogAnomalyShowcases: js.UndefOr[typings.awsSdk.devopsguruMod.LogAnomalyShowcases] = js.undefined
  
  /**
    *  The name of the CloudWatch log group. 
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.devopsguruMod.LogGroupName] = js.undefined
  
  /**
    *  The number of log lines that were scanned for anomalous log events. 
    */
  var NumberOfLogLinesScanned: js.UndefOr[typings.awsSdk.devopsguruMod.NumberOfLogLinesScanned] = js.undefined
}
object AnomalousLogGroup {
  
  inline def apply(): AnomalousLogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalousLogGroup]
  }
  
  extension [Self <: AnomalousLogGroup](x: Self) {
    
    inline def setImpactEndTime(value: js.Date): Self = StObject.set(x, "ImpactEndTime", value.asInstanceOf[js.Any])
    
    inline def setImpactEndTimeUndefined: Self = StObject.set(x, "ImpactEndTime", js.undefined)
    
    inline def setImpactStartTime(value: js.Date): Self = StObject.set(x, "ImpactStartTime", value.asInstanceOf[js.Any])
    
    inline def setImpactStartTimeUndefined: Self = StObject.set(x, "ImpactStartTime", js.undefined)
    
    inline def setLogAnomalyShowcases(value: LogAnomalyShowcases): Self = StObject.set(x, "LogAnomalyShowcases", value.asInstanceOf[js.Any])
    
    inline def setLogAnomalyShowcasesUndefined: Self = StObject.set(x, "LogAnomalyShowcases", js.undefined)
    
    inline def setLogAnomalyShowcasesVarargs(value: LogAnomalyShowcase*): Self = StObject.set(x, "LogAnomalyShowcases", js.Array(value*))
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setNumberOfLogLinesScanned(value: NumberOfLogLinesScanned): Self = StObject.set(x, "NumberOfLogLinesScanned", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLogLinesScannedUndefined: Self = StObject.set(x, "NumberOfLogLinesScanned", js.undefined)
  }
}
