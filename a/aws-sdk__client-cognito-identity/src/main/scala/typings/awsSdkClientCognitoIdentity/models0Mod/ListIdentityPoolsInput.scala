package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoolsInput extends StObject {
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.native
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListIdentityPoolsInput {
  
  @scala.inline
  def apply(): ListIdentityPoolsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolsInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListIdentityPoolsInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ListIdentityPoolsInput): js.Any = js.native
  
  @scala.inline
  implicit class ListIdentityPoolsInputMutableBuilder[Self <: ListIdentityPoolsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
