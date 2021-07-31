package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesRequest extends StObject {
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetResourcePoliciesRequest {
  
  @scala.inline
  def apply(): GetResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class GetResourcePoliciesRequestMutableBuilder[Self <: GetResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
