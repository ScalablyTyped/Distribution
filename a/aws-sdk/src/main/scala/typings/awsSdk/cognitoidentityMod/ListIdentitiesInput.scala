package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesInput extends StObject {
  
  /**
    * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API will include disabled identities in the response.
    */
  var HideDisabled: js.UndefOr[typings.awsSdk.cognitoidentityMod.HideDisabled] = js.undefined
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId
  
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object ListIdentitiesInput {
  
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId, MaxResults: QueryLimit): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesInput]
  }
  
  @scala.inline
  implicit class ListIdentitiesInputMutableBuilder[Self <: ListIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideDisabled(value: HideDisabled): Self = StObject.set(x, "HideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledUndefined: Self = StObject.set(x, "HideDisabled", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: QueryLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
