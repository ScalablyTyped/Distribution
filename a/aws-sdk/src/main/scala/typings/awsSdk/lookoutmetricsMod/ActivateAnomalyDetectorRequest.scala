package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateAnomalyDetectorRequest extends StObject {
  
  /**
    * The ARN of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
}
object ActivateAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): ActivateAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateAnomalyDetectorRequest]
  }
  
  extension [Self <: ActivateAnomalyDetectorRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
  }
}
