package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionGroupsResponse extends StObject {
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * 
    */
  var ProtectionGroups: typings.awsSdk.shieldMod.ProtectionGroups
}
object ListProtectionGroupsResponse {
  
  inline def apply(ProtectionGroups: ProtectionGroups): ListProtectionGroupsResponse = {
    val __obj = js.Dynamic.literal(ProtectionGroups = ProtectionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectionGroupsResponse]
  }
  
  extension [Self <: ListProtectionGroupsResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProtectionGroups(value: ProtectionGroups): Self = StObject.set(x, "ProtectionGroups", value.asInstanceOf[js.Any])
    
    inline def setProtectionGroupsVarargs(value: ProtectionGroup*): Self = StObject.set(x, "ProtectionGroups", js.Array(value*))
  }
}
