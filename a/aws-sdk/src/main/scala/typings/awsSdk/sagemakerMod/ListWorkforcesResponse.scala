package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkforcesResponse extends StObject {
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * A list containing information about your workforce.
    */
  var Workforces: typings.awsSdk.sagemakerMod.Workforces
}
object ListWorkforcesResponse {
  
  @scala.inline
  def apply(Workforces: Workforces): ListWorkforcesResponse = {
    val __obj = js.Dynamic.literal(Workforces = Workforces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkforcesResponse]
  }
  
  @scala.inline
  implicit class ListWorkforcesResponseMutableBuilder[Self <: ListWorkforcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWorkforces(value: Workforces): Self = StObject.set(x, "Workforces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkforcesVarargs(value: Workforce*): Self = StObject.set(x, "Workforces", js.Array(value :_*))
  }
}
