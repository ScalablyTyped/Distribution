package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionsResponse extends StObject {
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value.
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
    
    inline def setProtectionsVarargs(value: Protection*): Self = StObject.set(x, "Protections", js.Array(value*))
  }
}
