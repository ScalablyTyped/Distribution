package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceServersResponse extends StObject {
  
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
  implicit class ListResourceServersResponseMutableBuilder[Self <: ListResourceServersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceServers(value: ResourceServersListType): Self = StObject.set(x, "ResourceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceServersVarargs(value: ResourceServerType*): Self = StObject.set(x, "ResourceServers", js.Array(value :_*))
  }
}
