package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExtensibleSourceServersRequest extends StObject {
  
  /**
    * The maximum number of extensible source servers to retrieve.
    */
  var maxResults: js.UndefOr[MaxResultsReplicatingSourceServers] = js.undefined
  
  /**
    * The token of the next extensible source server to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Id of the staging Account to retrieve extensible source servers from.
    */
  var stagingAccountID: AccountID
}
object ListExtensibleSourceServersRequest {
  
  inline def apply(stagingAccountID: AccountID): ListExtensibleSourceServersRequest = {
    val __obj = js.Dynamic.literal(stagingAccountID = stagingAccountID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExtensibleSourceServersRequest]
  }
  
  extension [Self <: ListExtensibleSourceServersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResultsReplicatingSourceServers): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStagingAccountID(value: AccountID): Self = StObject.set(x, "stagingAccountID", value.asInstanceOf[js.Any])
  }
}
