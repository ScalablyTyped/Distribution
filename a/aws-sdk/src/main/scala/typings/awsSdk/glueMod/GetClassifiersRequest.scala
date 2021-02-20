package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClassifiersRequest extends StObject {
  
  /**
    * The size of the list to return (optional).
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * An optional continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetClassifiersRequest {
  
  @scala.inline
  def apply(): GetClassifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifiersRequest]
  }
  
  @scala.inline
  implicit class GetClassifiersRequestMutableBuilder[Self <: GetClassifiersRequest] (val x: Self) extends AnyVal {
    
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
