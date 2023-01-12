package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesInput extends StObject {
  
  /**
    * <p>An optional boolean parameter that allows you to hide disabled identities. If
    *          omitted, the ListIdentities API will include disabled identities in the response.</p>
    */
  var HideDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentitiesInput {
  
  inline def apply(): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIdentitiesInput] (val x: Self) extends AnyVal {
    
    inline def setHideDisabled(value: Boolean): Self = StObject.set(x, "HideDisabled", value.asInstanceOf[js.Any])
    
    inline def setHideDisabledUndefined: Self = StObject.set(x, "HideDisabled", js.undefined)
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
