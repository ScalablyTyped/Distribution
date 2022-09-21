package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionsResponse extends StObject {
  
  /**
    * A list of requested connection definitions.
    */
  var ConnectionList: js.UndefOr[typings.awsSdk.glueMod.ConnectionList] = js.undefined
  
  /**
    * A continuation token, if the list of connections returned does not include the last of the filtered connections.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetConnectionsResponse {
  
  inline def apply(): GetConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsResponse]
  }
  
  extension [Self <: GetConnectionsResponse](x: Self) {
    
    inline def setConnectionList(value: ConnectionList): Self = StObject.set(x, "ConnectionList", value.asInstanceOf[js.Any])
    
    inline def setConnectionListUndefined: Self = StObject.set(x, "ConnectionList", js.undefined)
    
    inline def setConnectionListVarargs(value: Connection*): Self = StObject.set(x, "ConnectionList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
