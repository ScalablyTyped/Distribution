package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesInProtectionGroupRequest extends StObject {
  
  /**
    * The maximum number of resource ARN objects to return. If you leave this blank, Shield Advanced returns the first 20 results. This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of objects returned could be less than MaxResults, even if there are still more objects yet to return. If there are more objects to return, Shield Advanced returns a value in NextToken that you can use in your next request, to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.undefined
  
  /**
    * The next token value from a previous call to ListResourcesInProtectionGroup. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typings.awsSdk.shieldMod.ProtectionGroupId
}
object ListResourcesInProtectionGroupRequest {
  
  inline def apply(ProtectionGroupId: ProtectionGroupId): ListResourcesInProtectionGroupRequest = {
    val __obj = js.Dynamic.literal(ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesInProtectionGroupRequest]
  }
  
  extension [Self <: ListResourcesInProtectionGroupRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProtectionGroupId(value: ProtectionGroupId): Self = StObject.set(x, "ProtectionGroupId", value.asInstanceOf[js.Any])
  }
}
