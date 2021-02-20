package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  
  /**
    * The array of test windows used for evaluating the algorithm. The NumberOfBacktestWindows from the EvaluationParameters object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[typings.awsSdk.forecastserviceMod.TestWindows] = js.native
}
object EvaluationResult {
  
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  @scala.inline
  implicit class EvaluationResultMutableBuilder[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    @scala.inline
    def setTestWindows(value: TestWindows): Self = StObject.set(x, "TestWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestWindowsUndefined: Self = StObject.set(x, "TestWindows", js.undefined)
    
    @scala.inline
    def setTestWindowsVarargs(value: WindowSummary*): Self = StObject.set(x, "TestWindows", js.Array(value :_*))
  }
}
