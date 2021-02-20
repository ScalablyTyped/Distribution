package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServersResponse extends StObject {
  
  /**
    * The time when the server was last modified.
    */
  var lastModifiedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The status of the server catalog.
    */
  var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.native
  
  /**
    * Information about the servers.
    */
  var serverList: js.UndefOr[ServerList] = js.native
}
object GetServersResponse {
  
  @scala.inline
  def apply(): GetServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServersResponse]
  }
  
  @scala.inline
  implicit class GetServersResponseMutableBuilder[Self <: GetServersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModifiedOn(value: Timestamp): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOnUndefined: Self = StObject.set(x, "lastModifiedOn", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setServerCatalogStatus(value: ServerCatalogStatus): Self = StObject.set(x, "serverCatalogStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCatalogStatusUndefined: Self = StObject.set(x, "serverCatalogStatus", js.undefined)
    
    @scala.inline
    def setServerList(value: ServerList): Self = StObject.set(x, "serverList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerListUndefined: Self = StObject.set(x, "serverList", js.undefined)
    
    @scala.inline
    def setServerListVarargs(value: Server*): Self = StObject.set(x, "serverList", js.Array(value :_*))
  }
}
