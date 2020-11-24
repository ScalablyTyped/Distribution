package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServersResponse extends js.Object {
  
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
  implicit class GetServersResponseOps[Self <: GetServersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastModifiedOn(value: Timestamp): Self = this.set("lastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedOn: Self = this.set("lastModifiedOn", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setServerCatalogStatus(value: ServerCatalogStatus): Self = this.set("serverCatalogStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCatalogStatus: Self = this.set("serverCatalogStatus", js.undefined)
    
    @scala.inline
    def setServerListVarargs(value: Server*): Self = this.set("serverList", js.Array(value :_*))
    
    @scala.inline
    def setServerList(value: ServerList): Self = this.set("serverList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerList: Self = this.set("serverList", js.undefined)
  }
}
