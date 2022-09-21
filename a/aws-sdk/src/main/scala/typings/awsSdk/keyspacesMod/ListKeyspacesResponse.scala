package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyspacesResponse extends StObject {
  
  /**
    * A list of keyspaces.
    */
  var keyspaces: KeyspaceSummaryList
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListKeyspacesResponse {
  
  inline def apply(keyspaces: KeyspaceSummaryList): ListKeyspacesResponse = {
    val __obj = js.Dynamic.literal(keyspaces = keyspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyspacesResponse]
  }
  
  extension [Self <: ListKeyspacesResponse](x: Self) {
    
    inline def setKeyspaces(value: KeyspaceSummaryList): Self = StObject.set(x, "keyspaces", value.asInstanceOf[js.Any])
    
    inline def setKeyspacesVarargs(value: KeyspaceSummary*): Self = StObject.set(x, "keyspaces", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
