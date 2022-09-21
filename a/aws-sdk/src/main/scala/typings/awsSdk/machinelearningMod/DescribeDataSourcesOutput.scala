package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSourcesOutput extends StObject {
  
  /**
    * An ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  
  /**
    * A list of DataSource that meet the search criteria. 
    */
  var Results: js.UndefOr[DataSources] = js.undefined
}
object DescribeDataSourcesOutput {
  
  inline def apply(): DescribeDataSourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourcesOutput]
  }
  
  extension [Self <: DescribeDataSourcesOutput](x: Self) {
    
    inline def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResults(value: DataSources): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: DataSource*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
