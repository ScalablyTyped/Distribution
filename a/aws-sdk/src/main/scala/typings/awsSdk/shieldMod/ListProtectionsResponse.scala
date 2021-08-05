package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionsResponse extends StObject {
  
  /**
    * If you specify a value for MaxResults and you have more Protections than the value of MaxResults, AWS Shield Advanced returns a NextToken value in the response that allows you to list another group of Protections. For the second and subsequent ListProtections requests, specify the value of NextToken from the previous response to get information about another batch of Protections. Shield Advanced might return the list of Protection objects in batches smaller than the number specified by MaxResults. If there are more Protection objects to return, Shield Advanced will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The array of enabled Protection objects.
    */
  var Protections: js.UndefOr[typings.awsSdk.shieldMod.Protections] = js.undefined
}
object ListProtectionsResponse {
  
  inline def apply(): ListProtectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsResponse]
  }
  
  extension [Self <: ListProtectionsResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProtections(value: Protections): Self = StObject.set(x, "Protections", value.asInstanceOf[js.Any])
    
    inline def setProtectionsUndefined: Self = StObject.set(x, "Protections", js.undefined)
    
    inline def setProtectionsVarargs(value: Protection*): Self = StObject.set(x, "Protections", js.Array(value :_*))
  }
}
