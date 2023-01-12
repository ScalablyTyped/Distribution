package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServersResponse extends StObject {
  
  /**
    * When you can get additional results from the ListServers operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing additional servers.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * An array of servers that were listed.
    */
  var Servers: ListedServers
}
object ListServersResponse {
  
  inline def apply(Servers: ListedServers): ListServersResponse = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServers(value: ListedServers): Self = StObject.set(x, "Servers", value.asInstanceOf[js.Any])
    
    inline def setServersVarargs(value: ListedServer*): Self = StObject.set(x, "Servers", js.Array(value*))
  }
}
