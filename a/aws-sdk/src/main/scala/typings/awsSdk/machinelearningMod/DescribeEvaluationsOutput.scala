package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEvaluationsOutput extends StObject {
  
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  
  /**
    * A list of Evaluation that meet the search criteria. 
    */
  var Results: js.UndefOr[Evaluations] = js.undefined
}
object DescribeEvaluationsOutput {
  
  @scala.inline
  def apply(): DescribeEvaluationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEvaluationsOutput]
  }
  
  @scala.inline
  implicit class DescribeEvaluationsOutputMutableBuilder[Self <: DescribeEvaluationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResults(value: Evaluations): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: Evaluation*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
