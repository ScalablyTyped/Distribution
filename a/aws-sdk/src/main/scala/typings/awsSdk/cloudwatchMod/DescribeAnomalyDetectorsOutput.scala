package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyDetectorsOutput extends StObject {
  
  /**
    * The list of anomaly detection models returned by the operation.
    */
  var AnomalyDetectors: js.UndefOr[typings.awsSdk.cloudwatchMod.AnomalyDetectors] = js.undefined
  
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object DescribeAnomalyDetectorsOutput {
  
  @scala.inline
  def apply(): DescribeAnomalyDetectorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyDetectorsOutput]
  }
  
  @scala.inline
  implicit class DescribeAnomalyDetectorsOutputMutableBuilder[Self <: DescribeAnomalyDetectorsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalyDetectors(value: AnomalyDetectors): Self = StObject.set(x, "AnomalyDetectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomalyDetectorsUndefined: Self = StObject.set(x, "AnomalyDetectors", js.undefined)
    
    @scala.inline
    def setAnomalyDetectorsVarargs(value: AnomalyDetector*): Self = StObject.set(x, "AnomalyDetectors", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
