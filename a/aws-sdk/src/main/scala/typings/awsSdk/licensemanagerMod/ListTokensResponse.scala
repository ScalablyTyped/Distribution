package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTokensResponse extends StObject {
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Received token details.
    */
  var Tokens: js.UndefOr[TokenList] = js.undefined
}
object ListTokensResponse {
  
  inline def apply(): ListTokensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTokensResponse]
  }
  
  extension [Self <: ListTokensResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTokens(value: TokenList): Self = StObject.set(x, "Tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "Tokens", js.undefined)
    
    inline def setTokensVarargs(value: TokenData*): Self = StObject.set(x, "Tokens", js.Array(value*))
  }
}
