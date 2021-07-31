package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersByPathResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * A list of parameters found in the specified hierarchy.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}
object GetParametersByPathResult {
  
  @scala.inline
  def apply(): GetParametersByPathResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersByPathResult]
  }
  
  @scala.inline
  implicit class GetParametersByPathResultMutableBuilder[Self <: GetParametersByPathResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
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
