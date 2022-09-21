package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalyDetectorResponse extends StObject {
  
  /**
    * The ARN of the detector.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
}
object CreateAnomalyDetectorResponse {
  
  inline def apply(): CreateAnomalyDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnomalyDetectorResponse]
  }
  
  extension [Self <: CreateAnomalyDetectorResponse](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
  }
}
