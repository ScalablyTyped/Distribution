package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBatchPredictionsOutput extends StObject {
  
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  
  /**
    * A list of BatchPrediction objects that meet the search criteria. 
    */
  var Results: js.UndefOr[BatchPredictions] = js.native
}
object DescribeBatchPredictionsOutput {
  
  @scala.inline
  def apply(): DescribeBatchPredictionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchPredictionsOutput]
  }
  
  @scala.inline
  implicit class DescribeBatchPredictionsOutputMutableBuilder[Self <: DescribeBatchPredictionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResults(value: BatchPredictions): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: BatchPrediction*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
