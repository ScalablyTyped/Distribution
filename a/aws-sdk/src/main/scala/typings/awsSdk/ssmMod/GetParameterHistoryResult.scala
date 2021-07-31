package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameterHistoryResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * A list of parameters returned by the request.
    */
  var Parameters: js.UndefOr[ParameterHistoryList] = js.undefined
}
object GetParameterHistoryResult {
  
  @scala.inline
  def apply(): GetParameterHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterHistoryResult]
  }
  
  @scala.inline
  implicit class GetParameterHistoryResultMutableBuilder[Self <: GetParameterHistoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParameters(value: ParameterHistoryList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ParameterHistory*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
