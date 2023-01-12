package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorsResponse extends StObject {
  
  /**
    * Returns an array, where each item contains the details of a connector.
    */
  var Connectors: ListedConnectors
  
  /**
    * Returns a token that you can use to call ListConnectors again and receive additional results, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListConnectorsResponse {
  
  inline def apply(Connectors: ListedConnectors): ListConnectorsResponse = {
    val __obj = js.Dynamic.literal(Connectors = Connectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectorsResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectors(value: ListedConnectors): Self = StObject.set(x, "Connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsVarargs(value: ListedConnector*): Self = StObject.set(x, "Connectors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
