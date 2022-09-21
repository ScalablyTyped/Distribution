package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorExecution extends StObject {
  
  /**
    * The ARN of the algorithm used to test the predictor.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * An array of test windows used to evaluate the algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[TestWindowDetails] = js.undefined
}
object PredictorExecution {
  
  inline def apply(): PredictorExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecution]
  }
  
  extension [Self <: PredictorExecution](x: Self) {
    
    inline def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    inline def setTestWindows(value: TestWindowDetails): Self = StObject.set(x, "TestWindows", value.asInstanceOf[js.Any])
    
    inline def setTestWindowsUndefined: Self = StObject.set(x, "TestWindows", js.undefined)
    
    inline def setTestWindowsVarargs(value: TestWindowSummary*): Self = StObject.set(x, "TestWindows", js.Array(value*))
  }
}
