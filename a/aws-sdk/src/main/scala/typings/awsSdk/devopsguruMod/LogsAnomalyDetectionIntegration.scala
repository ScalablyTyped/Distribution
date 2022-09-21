package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsAnomalyDetectionIntegration extends StObject {
  
  /**
    * Specifies if DevOps Guru is configured to perform log anomaly detection on CloudWatch log groups.
    */
  var OptInStatus: js.UndefOr[typings.awsSdk.devopsguruMod.OptInStatus] = js.undefined
}
object LogsAnomalyDetectionIntegration {
  
  inline def apply(): LogsAnomalyDetectionIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsAnomalyDetectionIntegration]
  }
  
  extension [Self <: LogsAnomalyDetectionIntegration](x: Self) {
    
    inline def setOptInStatus(value: OptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    inline def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}
