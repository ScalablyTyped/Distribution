package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDefaultParametersResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of parameters. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}
object DescribeDefaultParametersResponse {
  
  @scala.inline
  def apply(): DescribeDefaultParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultParametersResponse]
  }
  
  @scala.inline
  implicit class DescribeDefaultParametersResponseMutableBuilder[Self <: DescribeDefaultParametersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParameters(value: ParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
