package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictorExecution extends StObject {
  
  /**
    * The ARN of the algorithm used to test the predictor.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  
  /**
    * An array of test windows used to evaluate the algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[TestWindowDetails] = js.native
}
object PredictorExecution {
  
  @scala.inline
  def apply(): PredictorExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecution]
  }
  
  @scala.inline
  implicit class PredictorExecutionMutableBuilder[Self <: PredictorExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    @scala.inline
    def setTestWindows(value: TestWindowDetails): Self = StObject.set(x, "TestWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestWindowsUndefined: Self = StObject.set(x, "TestWindows", js.undefined)
    
    @scala.inline
    def setTestWindowsVarargs(value: TestWindowSummary*): Self = StObject.set(x, "TestWindows", js.Array(value :_*))
  }
}
