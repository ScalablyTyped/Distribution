package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHostKeysRequest extends StObject {
  
  /**
    * The maximum number of host keys to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.undefined
  
  /**
    * When there are additional results that were not returned, a NextToken parameter is returned. You can use that value for a subsequent call to ListHostKeys to continue listing results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.undefined
  
  /**
    * Provide the ID of the server that contains the host keys that you want to view.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object ListHostKeysRequest {
  
  inline def apply(ServerId: ServerId): ListHostKeysRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostKeysRequest]
  }
  
  extension [Self <: ListHostKeysRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
