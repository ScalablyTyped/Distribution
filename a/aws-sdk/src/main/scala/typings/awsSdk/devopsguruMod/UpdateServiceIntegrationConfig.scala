package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceIntegrationConfig extends StObject {
  
  /**
    *  Information about whether DevOps Guru is configured to perform log anomaly detection on Amazon CloudWatch log groups. 
    */
  var LogsAnomalyDetection: js.UndefOr[LogsAnomalyDetectionIntegrationConfig] = js.undefined
  
  var OpsCenter: js.UndefOr[OpsCenterIntegrationConfig] = js.undefined
}
object UpdateServiceIntegrationConfig {
  
  inline def apply(): UpdateServiceIntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceIntegrationConfig]
  }
  
  extension [Self <: UpdateServiceIntegrationConfig](x: Self) {
    
    inline def setLogsAnomalyDetection(value: LogsAnomalyDetectionIntegrationConfig): Self = StObject.set(x, "LogsAnomalyDetection", value.asInstanceOf[js.Any])
    
    inline def setLogsAnomalyDetectionUndefined: Self = StObject.set(x, "LogsAnomalyDetection", js.undefined)
    
    inline def setOpsCenter(value: OpsCenterIntegrationConfig): Self = StObject.set(x, "OpsCenter", value.asInstanceOf[js.Any])
    
    inline def setOpsCenterUndefined: Self = StObject.set(x, "OpsCenter", js.undefined)
  }
}
