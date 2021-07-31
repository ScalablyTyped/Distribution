package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMLModelsOutput extends StObject {
  
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  
  /**
    * A list of MLModel that meet the search criteria.
    */
  var Results: js.UndefOr[MLModels] = js.undefined
}
object DescribeMLModelsOutput {
  
  @scala.inline
  def apply(): DescribeMLModelsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMLModelsOutput]
  }
  
  @scala.inline
  implicit class DescribeMLModelsOutputMutableBuilder[Self <: DescribeMLModelsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResults(value: MLModels): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: MLModel*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
