package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServersResponse extends StObject {
  
  /**
    * The time when the server was last modified.
    */
  var lastModifiedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The status of the server catalog.
    */
  var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined
  
  /**
    * Information about the servers.
    */
  var serverList: js.UndefOr[ServerList] = js.undefined
}
object GetServersResponse {
  
  inline def apply(): GetServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServersResponse]
  }
  
  extension [Self <: GetServersResponse](x: Self) {
    
    inline def setLastModifiedOn(value: Timestamp): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "lastModifiedOn", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServerCatalogStatus(value: ServerCatalogStatus): Self = StObject.set(x, "serverCatalogStatus", value.asInstanceOf[js.Any])
    
    inline def setServerCatalogStatusUndefined: Self = StObject.set(x, "serverCatalogStatus", js.undefined)
    
    inline def setServerList(value: ServerList): Self = StObject.set(x, "serverList", value.asInstanceOf[js.Any])
    
    inline def setServerListUndefined: Self = StObject.set(x, "serverList", js.undefined)
    
    inline def setServerListVarargs(value: Server*): Self = StObject.set(x, "serverList", js.Array(value :_*))
  }
}
