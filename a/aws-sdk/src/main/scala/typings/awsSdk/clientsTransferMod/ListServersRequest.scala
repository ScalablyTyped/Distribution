package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServersRequest extends StObject {
  
  /**
    * Specifies the number of servers to return as a response to the ListServers query.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTransferMod.MaxResults] = js.undefined
  
  /**
    * When additional results are obtained from the ListServers command, a NextToken parameter is returned in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional servers.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListServersRequest {
  
  inline def apply(): ListServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServersRequest]
  }
  
  extension [Self <: ListServersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
