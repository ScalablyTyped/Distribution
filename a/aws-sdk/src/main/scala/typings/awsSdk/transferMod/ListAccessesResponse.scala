package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessesResponse extends StObject {
  
  /**
    * Returns the accesses and their properties for the ServerId value that you specify.
    */
  var Accesses: ListedAccesses
  
  /**
    * When you can get additional results from the ListAccesses call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional accesses.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server that has users assigned to it.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object ListAccessesResponse {
  
  inline def apply(Accesses: ListedAccesses, ServerId: ServerId): ListAccessesResponse = {
    val __obj = js.Dynamic.literal(Accesses = Accesses.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessesResponse]
  }
  
  extension [Self <: ListAccessesResponse](x: Self) {
    
    inline def setAccesses(value: ListedAccesses): Self = StObject.set(x, "Accesses", value.asInstanceOf[js.Any])
    
    inline def setAccessesVarargs(value: ListedAccess*): Self = StObject.set(x, "Accesses", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
