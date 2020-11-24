package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceServersResponse extends js.Object {
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  
  /**
    * The resource servers.
    */
  var ResourceServers: ResourceServersListType = js.native
}
object ListResourceServersResponse {
  
  @scala.inline
  def apply(ResourceServers: ResourceServersListType): ListResourceServersResponse = {
    val __obj = js.Dynamic.literal(ResourceServers = ResourceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceServersResponse]
  }
  
  @scala.inline
  implicit class ListResourceServersResponseOps[Self <: ListResourceServersResponse] (val x: Self) extends AnyVal {
    
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
    def setResourceServersVarargs(value: ResourceServerType*): Self = this.set("ResourceServers", js.Array(value :_*))
    
    @scala.inline
    def setResourceServers(value: ResourceServersListType): Self = this.set("ResourceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
