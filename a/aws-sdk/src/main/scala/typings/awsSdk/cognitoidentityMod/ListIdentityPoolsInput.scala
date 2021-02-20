package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoolsInput extends StObject {
  
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit = js.native
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}
object ListIdentityPoolsInput {
  
  @scala.inline
  def apply(MaxResults: QueryLimit): ListIdentityPoolsInput = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsInput]
  }
  
  @scala.inline
  implicit class ListIdentityPoolsInputMutableBuilder[Self <: ListIdentityPoolsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: QueryLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
