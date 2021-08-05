package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The array of test windows used for evaluating the algorithm. The NumberOfBacktestWindows from the EvaluationParameters object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[typings.awsSdk.forecastserviceMod.TestWindows] = js.undefined
}
object EvaluationResult {
  
  inline def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  extension [Self <: EvaluationResult](x: Self) {
    
    inline def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    inline def setTestWindows(value: TestWindows): Self = StObject.set(x, "TestWindows", value.asInstanceOf[js.Any])
    
    inline def setTestWindowsUndefined: Self = StObject.set(x, "TestWindows", js.undefined)
    
    inline def setTestWindowsVarargs(value: WindowSummary*): Self = StObject.set(x, "TestWindows", js.Array(value :_*))
  }
}
