package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTunnelsResponse extends StObject {
  
  /**
    * A token to used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A short description of the tunnels in an AWS account.
    */
  var tunnelSummaries: js.UndefOr[TunnelSummaryList] = js.undefined
}
object ListTunnelsResponse {
  
  inline def apply(): ListTunnelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTunnelsResponse]
  }
  
  extension [Self <: ListTunnelsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTunnelSummaries(value: TunnelSummaryList): Self = StObject.set(x, "tunnelSummaries", value.asInstanceOf[js.Any])
    
    inline def setTunnelSummariesUndefined: Self = StObject.set(x, "tunnelSummaries", js.undefined)
    
    inline def setTunnelSummariesVarargs(value: TunnelSummary*): Self = StObject.set(x, "tunnelSummaries", js.Array(value :_*))
  }
}
