package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineVersionsRequest extends StObject {
  
  /**
    * If true, specifies that only the default version of the specified engine or engine and major version combination is to be returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Redis engine version
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a specific parameter group family to return details for.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.undefined
}
object DescribeEngineVersionsRequest {
  
  inline def apply(): DescribeEngineVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineVersionsRequest]
  }
  
  extension [Self <: DescribeEngineVersionsRequest](x: Self) {
    
    inline def setDefaultOnly(value: Boolean): Self = StObject.set(x, "DefaultOnly", value.asInstanceOf[js.Any])
    
    inline def setDefaultOnlyUndefined: Self = StObject.set(x, "DefaultOnly", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupFamilyUndefined: Self = StObject.set(x, "ParameterGroupFamily", js.undefined)
  }
}
