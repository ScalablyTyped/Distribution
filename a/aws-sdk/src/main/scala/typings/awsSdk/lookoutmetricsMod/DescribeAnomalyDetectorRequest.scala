package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyDetectorRequest extends StObject {
  
  /**
    * The ARN of the detector to describe.
    */
  var AnomalyDetectorArn: Arn
}
object DescribeAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): DescribeAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnomalyDetectorRequest]
  }
  
  extension [Self <: DescribeAnomalyDetectorRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
  }
}
