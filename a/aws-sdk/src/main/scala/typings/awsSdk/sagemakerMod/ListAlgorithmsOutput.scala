package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlgorithmsOutput extends StObject {
  
  /**
    * &gt;An array of AlgorithmSummary objects, each of which lists an algorithm.
    */
  var AlgorithmSummaryList: typings.awsSdk.sagemakerMod.AlgorithmSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListAlgorithmsOutput {
  
  @scala.inline
  def apply(AlgorithmSummaryList: AlgorithmSummaryList): ListAlgorithmsOutput = {
    val __obj = js.Dynamic.literal(AlgorithmSummaryList = AlgorithmSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlgorithmsOutput]
  }
  
  @scala.inline
  implicit class ListAlgorithmsOutputMutableBuilder[Self <: ListAlgorithmsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmSummaryList(value: AlgorithmSummaryList): Self = StObject.set(x, "AlgorithmSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmSummaryListVarargs(value: AlgorithmSummary*): Self = StObject.set(x, "AlgorithmSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
