package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeParametersResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of parameters within a parameter group. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}
object DescribeParametersResponse {
  
  inline def apply(): DescribeParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParametersResponse]
  }
  
  extension [Self <: DescribeParametersResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameters(value: ParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
