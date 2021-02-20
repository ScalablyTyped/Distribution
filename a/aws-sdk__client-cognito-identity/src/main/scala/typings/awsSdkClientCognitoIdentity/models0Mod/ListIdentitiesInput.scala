package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentitiesInput extends StObject {
  
  /**
    * <p>An optional boolean parameter that allows you to hide disabled identities. If
    *          omitted, the ListIdentities API will include disabled identities in the response.</p>
    */
  var HideDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.native
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListIdentitiesInput {
  
  @scala.inline
  def apply(): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListIdentitiesInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ListIdentitiesInput): js.Any = js.native
  
  @scala.inline
  implicit class ListIdentitiesInputMutableBuilder[Self <: ListIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideDisabled(value: Boolean): Self = StObject.set(x, "HideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledUndefined: Self = StObject.set(x, "HideDisabled", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
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
